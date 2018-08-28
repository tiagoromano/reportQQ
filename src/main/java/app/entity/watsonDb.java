package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela WATSONDB
 * @generated
 */
@Entity
@Table(name = "\"WATSONDB\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.watsonDb")
public class watsonDb implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "text", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String text;

  /**
  * @generated
  */
  @Column(name = "context", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String from;

  /**
   * Construtor
   * @generated
   */
  public watsonDb(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public watsonDb setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém text
   * return text
   * @generated
   */
  
  public java.lang.String getText(){
    return this.text;
  }

  /**
   * Define text
   * @param text text
   * @generated
   */
  public watsonDb setText(java.lang.String text){
    this.text = text;
    return this;
  }

  /**
   * Obtém from
   * return from
   * @generated
   */
  
  public java.lang.String getFrom(){
    return this.from;
  }

  /**
   * Define from
   * @param from from
   * @generated
   */
  public watsonDb setFrom(java.lang.String from){
    this.from = from;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    watsonDb object = (watsonDb)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
