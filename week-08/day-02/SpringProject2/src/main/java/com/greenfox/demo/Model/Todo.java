package com.greenfox.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public long getId() {
    return id;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }
}
