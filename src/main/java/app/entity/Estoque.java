package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ESTOQUE
 * @generated
 */
@Entity
@Table(name = "\"ESTOQUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Estoque")
public class Estoque implements Serializable {

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
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo;

  /**
  * @generated
  */
  @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer quantidade;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "observacoes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String observacoes;

  /**
  * @generated
  */
  @Column(name = "lote", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String lote;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "validade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date validade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Produto produto;

  /**
   * Construtor
   * @generated
   */
  public Estoque(){
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
  public Estoque setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  
  public java.lang.String getTipo(){
    return this.tipo;
  }

  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Estoque setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }

  /**
   * Obtém quantidade
   * return quantidade
   * @generated
   */
  
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }

  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public Estoque setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Estoque setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém observacoes
   * return observacoes
   * @generated
   */
  
  public java.lang.String getObservacoes(){
    return this.observacoes;
  }

  /**
   * Define observacoes
   * @param observacoes observacoes
   * @generated
   */
  public Estoque setObservacoes(java.lang.String observacoes){
    this.observacoes = observacoes;
    return this;
  }

  /**
   * Obtém lote
   * return lote
   * @generated
   */
  
  public java.lang.String getLote(){
    return this.lote;
  }

  /**
   * Define lote
   * @param lote lote
   * @generated
   */
  public Estoque setLote(java.lang.String lote){
    this.lote = lote;
    return this;
  }

  /**
   * Obtém validade
   * return validade
   * @generated
   */
  
  public java.util.Date getValidade(){
    return this.validade;
  }

  /**
   * Define validade
   * @param validade validade
   * @generated
   */
  public Estoque setValidade(java.util.Date validade){
    this.validade = validade;
    return this;
  }

  /**
   * Obtém produto
   * return produto
   * @generated
   */
  
  public Produto getProduto(){
    return this.produto;
  }

  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public Estoque setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Estoque object = (Estoque)obj;
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
