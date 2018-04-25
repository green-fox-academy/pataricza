package com.greenfox.demo.controller;

import com.greenfox.demo.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value = "/greeter")
  public Greeting returnGreeting(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "title", required = false) String title) {

    if (name == null) {
      return new Greeting("Please provide a name!");
    } else if (title == null) {
      return new Greeting("Please provide a title!");
    } else {
      return new Greeting(name, title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public AppendWord appendA(@PathVariable("appendable") String append) {
    return new AppendWord(append);
  }

  @PostMapping(value = "/dountil/{what}")
  public Result doUntil(@PathVariable("what") String what, @RequestBody(required = false) UntilUntil untilUntil) {
    if (untilUntil != null) {
      if (what.equals("factor")) {
        return new Result(untilUntil.factorial());
      } else if (what.equals("sum")) {
        return new Result(untilUntil.summing());
      }
    }
    return new Result();
  }

  @PostMapping("/arrays")
  public ResponseEntity<ResultResponse> arrayResponse(@RequestBody(required = false) ComplexJsonObject complexJsonObject) {
    if (complexJsonObject == null)
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide what to do with the numbers."));
    if (complexJsonObject.getWhat() == null || complexJsonObject.getNumbers() == null)
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide what to do with the numbers."));
    else if (complexJsonObject.getWhat().equals("sum") || complexJsonObject.getWhat().equals("multiply"))
      return ResponseEntity.status(HttpStatus.OK).body(new Result2(complexJsonObject.getWhat(), complexJsonObject.getNumbers()));
    else if (complexJsonObject.getWhat().equals("double"))
      return ResponseEntity.status(HttpStatus.OK).body(new Result3(complexJsonObject.getNumbers()));
    else
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide what to do with the numbers."));
  }
}
