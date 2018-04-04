package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfAccounts {
  List<BankAccount> accountlist;

  public ListOfAccounts() {
    accountlist = new ArrayList<>();
    accountlist.add(new BankAccount("Shenzi", 10,"hyena"));
    accountlist.add(new BankAccount("Banzai", 30,"hyena"));
    accountlist.add(new BankAccount("Ed", 15,"hyena"));
    accountlist.add(new BankAccount("Timon", 10,"meerkat"));
    accountlist.add(new BankAccount("Bumba", 45,"warthog"));
  }

  public List<BankAccount> getAccountlist() {
    return accountlist;
  }
}
