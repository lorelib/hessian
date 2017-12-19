package com.caucho.examples.spring;

import java.util.List;

/**
 * @author listening
 * @description
 * @date 2017-12-19 19:19
 * @since 1.0
 */
public interface AccountService {
  void insertAccount(Account account);

  List<Account> getAccounts(String name);
}
