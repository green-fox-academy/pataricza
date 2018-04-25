package com.greenfox.demo.model;

public class Result3 implements ResultResponse{

  private int[] result;

  public Result3(int[] numbers) {
    doubleThem(numbers);
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  public void doubleThem(int[] numbers) {
    result = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      result[i] = numbers[i] * 2;
    }
  }
}
