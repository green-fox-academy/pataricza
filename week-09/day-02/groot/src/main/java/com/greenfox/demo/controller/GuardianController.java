package com.greenfox.demo.controller;

import model.Arrow;
import model.ArrowResponse;
import model.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

  @GetMapping("/yondu")
  public ResponseEntity<ArrowResponse> arrowResponse(@RequestParam(value = "distance", required = false) Double distance,
                                                     @RequestParam(value = "time", required = false) Double time) {
    if (distance != null && time != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Arrow(distance, time));
    } else return ResponseEntity.badRequest().build();
  }
}
