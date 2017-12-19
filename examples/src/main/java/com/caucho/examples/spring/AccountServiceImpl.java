package com.caucho.examples.spring;

import java.util.ArrayList;
import java.util.List;

/**
 * @author listening
 * @description
 * @date 2017-12-19 19:21
 * @since 1.0
 */
public class AccountServiceImpl implements AccountService {
  @Override
  public void insertAccount(Account account) {
    System.out.println("name: " + account.getName());
  }

  @Override
  public List<Account> getAccounts(String name) {
    List<Account> accounts = new ArrayList<>();
    accounts.add(new Account(name));
    return accounts;
  }
}
