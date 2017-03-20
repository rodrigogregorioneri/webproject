package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Class1
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Class1")
public class Class1REST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("Class1Business")
  private Class1Business class1Business;
  
  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Class1 post(@Validated @RequestBody final Class1 entity) throws Exception {
    return class1Business.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Class1 put(@Validated @RequestBody final Class1 entity) throws Exception {
    return class1Business.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{class1Id}")
  public Class1 put(@Validated @RequestBody final Class1 entity, @PathVariable("class1Id") java.lang.String class1Id) throws Exception {
    return class1Business.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{class1Id}")
  public void delete(@PathVariable("class1Id") java.lang.String class1Id) throws Exception {
    class1Business.delete(class1Id);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public HttpEntity<PagedResources<Class1>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(class1Business.list(pageable)), HttpStatus.OK);    
  }



  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{class1id}")
  public Class1 get(@PathVariable("class1id") java.lang.String class1id) throws Exception {
    return class1Business.get(class1id);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/download/attribute_01/{id}")
  public byte[] getAttribute_01(@PathVariable String id) throws Exception {
    Class1 entity = class1Business.get(id);
    return entity.getAttribute_01();
  }

}
