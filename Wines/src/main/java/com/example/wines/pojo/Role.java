package com.example.wines.pojo;

import java.io.Serializable;
public class Role implements Serializable {
  private Integer id;
  private String name;
  private String nameZH;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getNameZH() {
    return nameZH;
  }
  public void setNameZH(String nameZH) {
    this.nameZH = nameZH;
  }
}