package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Produto")
public class Produto implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "codigo_produto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String codigo_produto;

  /**
  * @generated
  */
  @Column(name = "categoria", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String categoria;

  /**
  * @generated
  */
  @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String marca;

  /**
  * @generated
  */
  @Column(name = "preco_custo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double preco_custo;

  /**
  * @generated
  */
  @Column(name = "preco_venda", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double preco_venda;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_fornecedor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Fornecedor fornecedor;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] foto;

  /**
   * Construtor
   * @generated
   */
  public Produto(){
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
  public Produto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Produto setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém codigo_produto
   * return codigo_produto
   * @generated
   */
  
  public java.lang.String getCodigo_produto(){
    return this.codigo_produto;
  }

  /**
   * Define codigo_produto
   * @param codigo_produto codigo_produto
   * @generated
   */
  public Produto setCodigo_produto(java.lang.String codigo_produto){
    this.codigo_produto = codigo_produto;
    return this;
  }

  /**
   * Obtém categoria
   * return categoria
   * @generated
   */
  
  public java.lang.String getCategoria(){
    return this.categoria;
  }

  /**
   * Define categoria
   * @param categoria categoria
   * @generated
   */
  public Produto setCategoria(java.lang.String categoria){
    this.categoria = categoria;
    return this;
  }

  /**
   * Obtém marca
   * return marca
   * @generated
   */
  
  public java.lang.String getMarca(){
    return this.marca;
  }

  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public Produto setMarca(java.lang.String marca){
    this.marca = marca;
    return this;
  }

  /**
   * Obtém preco_custo
   * return preco_custo
   * @generated
   */
  
  public java.lang.Double getPreco_custo(){
    return this.preco_custo;
  }

  /**
   * Define preco_custo
   * @param preco_custo preco_custo
   * @generated
   */
  public Produto setPreco_custo(java.lang.Double preco_custo){
    this.preco_custo = preco_custo;
    return this;
  }

  /**
   * Obtém preco_venda
   * return preco_venda
   * @generated
   */
  
  public java.lang.Double getPreco_venda(){
    return this.preco_venda;
  }

  /**
   * Define preco_venda
   * @param preco_venda preco_venda
   * @generated
   */
  public Produto setPreco_venda(java.lang.Double preco_venda){
    this.preco_venda = preco_venda;
    return this;
  }

  /**
   * Obtém fornecedor
   * return fornecedor
   * @generated
   */
  
  public Fornecedor getFornecedor(){
    return this.fornecedor;
  }

  /**
   * Define fornecedor
   * @param fornecedor fornecedor
   * @generated
   */
  public Produto setFornecedor(Fornecedor fornecedor){
    this.fornecedor = fornecedor;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public byte[] getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Produto setFoto(byte[] foto){
    this.foto = foto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
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
