package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfAccounts {
  private List<BankAccount> accountlist;

  public ListOfAccounts() {
    accountlist = new ArrayList<>();
    accountlist.add(new BankAccount("Shenzi", 10, "hyena", false, false));
    accountlist.add(new BankAccount("Banzai", 30, "hyena", false, false));
    accountlist.add(new BankAccount("Ed", 15, "hyena", false, false));
    accountlist.add(new BankAccount("Timon", 10, "meerkat", false, true));
    accountlist.add(new BankAccount("Bumba", 45, "warthog", false, true));
    accountlist.add(new BankAccount("Lion King", 200, "lion", true, true));

  }

  public List<BankAccount> getAccountlist() {
    return accountlist;
  }

  public void raiseOneAccount(int id) {
    accountlist.get(id).raiseAccount();
  }
}
