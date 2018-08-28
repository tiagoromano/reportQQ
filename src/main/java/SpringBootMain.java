import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.assertj.core.util.Files;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TimeZone;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletException;

@SpringBootApplication
@ComponentScan(basePackages = {
	"cronapp.framework.authentication.token",
	"cronapp.framework.authentication.security",
	"cronapp.framework.rest",
	"auth.permission",
	"api.rest.events",
	"api.rest.webservices",
	"reports",
	"cronapi",
	"blockly",
	"app"
})
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class SpringBootMain extends SpringBootServletInitializer {

	static {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) throws Exception {
		Path webappPath = Paths.get("src/main/webapp/");
		Tomcat tomcat = new Tomcat();

		//The port that we should run on can be set into an environment variable
		//Look for that variable and default to 8080 if it isn't there.
		String port = System.getenv("PORT");
		if(port == null || port.isEmpty()) {
		  port = "8000";
		}
	
		File baseDir = Files.newTemporaryFolder();
		baseDir.mkdirs();
	
		tomcat.setPort(Integer.valueOf(port));
		tomcat.setBaseDir(baseDir.getAbsolutePath());
		tomcat.enableNaming();
		tomcat.getConnector();
	
		StandardContext context;
	
		if (webappPath.toFile().exists()) {
		  context = (StandardContext) tomcat.addWebapp("", webappPath.toAbsolutePath().toString());
		} else {
		  File docBase = Files.newTemporaryFolder();
		  docBase.mkdirs();
		  context = (StandardContext) tomcat.addWebapp("", docBase.getAbsolutePath());
		}
	
		context.setDefaultContextXml(Paths.get("config/context.xml").toAbsolutePath().toString());
	
		tomcat.start();
		tomcat.getServer().await();
		}
}
