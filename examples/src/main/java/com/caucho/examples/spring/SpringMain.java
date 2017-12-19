package com.caucho.examples.spring;

import com.caucho.examples.helloworld.HelloAPI;
import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * @author listening
 * @description
 * @date 2017-12-19 22:54
 * @since 1.0
 */
public class SpringMain {
  private static String url = "http://localhost:8080/remoting/AccountService";

  public static void main(String[] args) throws MalformedURLException {
    HessianProxyFactory factory = new HessianProxyFactory();
    AccountService accountService = (AccountService) factory.create(AccountService.class, url);

    Account account = new Account("listening");
    accountService.insertAccount(account);
  }
}
