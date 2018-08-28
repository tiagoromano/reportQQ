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
@Repository("EstoqueDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EstoqueDAO extends JpaRepository<Estoque, java.lang.String> {

  /**
   * Obtém a instância de Estoque utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Estoque entity WHERE entity.id = :id")
  public Estoque findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Estoque utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Estoque entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key produto
   * @generated
   */
  @Query("SELECT entity FROM Estoque entity WHERE entity.produto.id = :id")
  public Page<Estoque> findEstoquesByProduto(@Param(value="id") java.lang.String id, Pageable pageable);

}
