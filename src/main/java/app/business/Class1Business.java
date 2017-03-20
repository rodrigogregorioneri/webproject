package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
import cloud.CloudManager;

/**
 * Classe que representa a camada de negócios de Class1Business
 * 
 * @generated
 **/
@Service("Class1Business")
public class Class1Business {


  private static final String DROPBOX_APP_ACCESS_TOKEN = "UQhxR5M-yUAAAAAAAAAAFbGJa29-98iGYVTdDosdQYQwvQog9yUGk93C-UtI12DD";

  private final CloudManager cloudManager = CloudManager.newInstance().byID("id").toFields("attribute_01");

  /**
   * Instância da classe Class1DAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("Class1DAO")
  protected Class1DAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Class1 post(final Class1 entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Class1 result = null;
    byte[] attribute_01 = entity.getAttribute_01();
    result = repository.save(entity);
    result.setAttribute_01(attribute_01);
    this.cloudManager.byEntity(result).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).upload();    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Class1 put(final Class1 entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Class1 result = null;
    byte[] attribute_01 = entity.getAttribute_01();

    result = repository.saveAndFlush(entity);
    result.setAttribute_01(attribute_01);
    this.cloudManager.byEntity(result).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).upload();
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Class1 entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
      this.cloudManager.byEntity(entity).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).delete();
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Class1 get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Class1 result = repository.findOne(id);
    this.cloudManager.byEntity(result).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).popule(result);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Class1> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Class1> result = repository.list(pageable);
    result.forEach(item -> cloudManager.byEntity(item).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).popule(item));
    // begin-user-code
    // end-user-code
    return result;
  }
}