package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private long balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, long balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public void raiseAccount() {
    if (isKing) {
      balance += 100;
    } else {
      balance += 10;
    }
  }
}
