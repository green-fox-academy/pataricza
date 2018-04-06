package com.greenfox.demo.Model;

public enum Foods {
  FOOD1("Salad"),
  FOOD2("Pizza"),
  FOOD3("Hamburger"),
  FOOD4("Bacon"),
  FOOD5("Hot-Dog"),
  FOOD6("Chicken and rice");


  private String food;

  Foods(String url) {
    this.food = url;
  }

  public String url() {
    return food;
  }
}
