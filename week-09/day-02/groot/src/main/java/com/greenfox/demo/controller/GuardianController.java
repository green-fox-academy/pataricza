package com.greenfox.demo.controller;

import model.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Groot grootResponse(@RequestParam(value = "message", required = false) String message) {
    if (message == null)
      return new Groot();
    else
      return new Groot(message);
  }
}
