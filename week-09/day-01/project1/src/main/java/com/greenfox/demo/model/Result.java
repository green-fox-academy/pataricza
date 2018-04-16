package com.greenfox.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

  private Integer result;
  private String error;

  public Result() {
    error = "Please provide a number!";
    result = 0;
  }

  public Result(Integer result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
