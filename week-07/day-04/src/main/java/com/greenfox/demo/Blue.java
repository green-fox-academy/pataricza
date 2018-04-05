package com.greenfox.demo;

import org.springframework.stereotype.Service;

@Service
public class Blue implements MyColor{
  @Override
  public String printColor() {
    return "Blue";
  }
}
