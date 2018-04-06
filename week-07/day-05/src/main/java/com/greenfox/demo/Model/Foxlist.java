package com.greenfox.demo.Model;

import java.util.List;

public class Foxlist {

  List<Fox> foxlist;

  public List<Fox> getFoxlist() {
    return foxlist;
  }

  public void setFoxlist(List<Fox> foxlist) {
    this.foxlist = foxlist;
  }

  public void addFox(Fox fox) {
    foxlist.add(fox);
  }
}
