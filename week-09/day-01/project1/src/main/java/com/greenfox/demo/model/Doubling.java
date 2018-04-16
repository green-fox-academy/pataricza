package com.greenfox.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Doubling {

  private String received;
  private String result;
  private String error;

  public Doubling() {
    error = "Please provide an input!";
  }

  public Doubling(String number) {
    this.received = number;
    result = String.valueOf(Integer.parseInt(number)*2);
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
