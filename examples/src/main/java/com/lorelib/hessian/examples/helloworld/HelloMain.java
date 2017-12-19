package com.lorelib.hessian.examples.helloworld;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * @author listening
 * @description
 * @date 2017-12-19 18:05
 * @since 1.0
 */
public class HelloMain {
  private static String url = "http://localhost:8080/hessian";

  public static void main(String[] args) throws MalformedURLException {
    HessianProxyFactory factory = new HessianProxyFactory();
    HelloAPI hello = (HelloAPI) factory.create(HelloAPI.class, url);
    System.out.println("hello: " + hello.hello());
  }
}
