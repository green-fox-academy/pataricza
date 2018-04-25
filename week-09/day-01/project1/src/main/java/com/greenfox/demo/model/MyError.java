package com.greenfox.demo.model;

public class MyError implements ResultResponse{

  private String error;

  public MyError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
