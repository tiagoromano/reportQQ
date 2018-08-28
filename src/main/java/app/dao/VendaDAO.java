package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("VendaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface VendaDAO extends JpaRepository<Venda, java.lang.String> {

  /**
   * Obtém a instância de Venda utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Venda entity WHERE entity.id = :id")
  public Venda findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Venda utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Venda entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key produto
   * @generated
   */
  @Query("SELECT entity FROM Venda entity WHERE entity.produto.id = :id")
  public Page<Venda> findVendasByProduto(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key pedido
   * @generated
   */
  @Query("SELECT entity FROM Venda entity WHERE entity.pedido.id = :id")
  public Page<Venda> findVendasByPedido(@Param(value="id") java.lang.String id, Pageable pageable);

}
