package com.greenfox.demo;

import org.springframework.stereotype.Service;


public class Green implements MyColor{
  @Override
  public String printColor() {
    return "Green";
  }
}
