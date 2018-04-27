package com.example.patariczagyorgy.openlibrary.model;

import java.util.List;

public class Library {

  List<RealBook> works;

  public Library() {
  }

  public List<RealBook> getWorks() {
    return works;
  }

  public void setWorks(List<RealBook> works) {
    this.works = works;
  }
}
