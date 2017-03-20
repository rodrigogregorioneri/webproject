package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela CLASS1
 * @generated
 */
@Entity
@Table(name = "\"CLASS1\"")
@XmlRootElement
public class Class1 implements Serializable {

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
  @Column(name = "attribute_01", nullable = true, unique = false, insertable=true, updatable=true)
  private byte[] attribute_01;
  
  /**
   * Construtor
   * @generated
   */
  public Class1(){
  }

  /**
   * Obtém id
   * 
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
  public Class1 setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém attribute_01
   * 
   * return attribute_01
   * @generated
   */
  public byte[] getAttribute_01(){
    return this.attribute_01;
  }
  
  /**
   * Define attribute_01
   * @param attribute_01 attribute_01
   * @generated
   */
  public Class1 setAttribute_01(byte[] attribute_01){
    this.attribute_01 = attribute_01;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Class1 object = (Class1)obj;
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