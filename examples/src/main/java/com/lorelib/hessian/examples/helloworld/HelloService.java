package com.lorelib.hessian.examples.helloworld;

/**
 * @author listening
 * @description
 * @date 2017-12-19 18:04
 * @since 1.0
 */
public class HelloService implements HelloAPI {
  private String greeting = "Hello world";

  @Override
  public String hello() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
}
