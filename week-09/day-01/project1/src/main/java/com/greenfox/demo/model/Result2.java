package com.greenfox.demo.model;

public class Result2 implements ResultResponse{

  private int result;

  public Result2(String what, int[] numbers) {
    if (what.equals("sum")) {
      sum(numbers);
    } else if (what.equals("multiply")) {
      multiply(numbers);
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
  }

  public void multiply(int[] numbers) {
    result = 1;
    for (int i = 0; i < numbers.length; i++) {
      result *= numbers[i];
    }
  }
}
