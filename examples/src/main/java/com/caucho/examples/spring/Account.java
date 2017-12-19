package com.caucho.examples.spring;

import java.io.Serializable;

/**
 * @author listening
 * @description
 * @date 2017-12-19 19:16
 * @since 1.0
 */
public class Account implements Serializable {
  private String name;

  public Account(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
