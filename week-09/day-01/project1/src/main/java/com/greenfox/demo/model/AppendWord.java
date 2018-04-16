package com.greenfox.demo.model;

public class AppendWord {

  private String appended;

  public AppendWord(String abbendThis) {
    appended = abbendThis + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
