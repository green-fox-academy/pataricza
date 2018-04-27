package com.example.patariczagyorgy.openlibrary.model;

import com.google.gson.annotations.SerializedName;

public class RealBook {

  @SerializedName("cover_id")
  private long coverId;
  private String title;

  public RealBook() {
  }

  public long getCoverId() {
    return coverId;
  }

  public void setCoverId(long coverId) {
    this.coverId = coverId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
