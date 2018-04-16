package com.greenfox.demo.model;

public class UntilUntil {

  private Integer until;

  public UntilUntil() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  public int factorial() {
    int result = 1;

    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }

  public int summing() {
    int result = 0;

    for (int i = 0; i <= until; i++) {
      result += i;
    }
    return result;
  }
}
