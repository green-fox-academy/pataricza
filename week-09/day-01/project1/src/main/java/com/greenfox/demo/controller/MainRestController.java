package com.greenfox.demo.controller;

import com.greenfox.demo.model.Doubling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


  @GetMapping(value = "/doubling")
  public Doubling returnDouble(@RequestParam(value = "input", required = false) String number) {
    if (number == null) {
      return new Doubling();
    } else {
      return new Doubling(number);
    }
  }

  @GetMapping(value = "/greeting")
  public Doubling returnGreeting(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "name", required = false) String title) {

  }
}
