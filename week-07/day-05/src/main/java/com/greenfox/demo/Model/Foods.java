package com.greenfox.demo.Model;

public enum Foods {
  FOOD1("Salad"),
  FOOD2("Pizza"),
  FOOD3("Hamburger"),
  FOOD4("Bacon"),
  FOOD5("Hot-Dog"),
  FOOD6("Chicken and rice");


  private String url;

  WhoisRIR(String url) {
    this.url = url;
  }

  public String url() {
    return url;
  }
}
