package com.greenfox.demo.Model;

import org.springframework.stereotype.Service;
@Service
public class GreenfoxImages {

  private String greenfox;

  public GreenfoxImages(){
    greenfox = "greenfox.png";
  }

  public String getGreenfox() {
    return greenfox;
  }
}
