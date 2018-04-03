package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private AtomicLong id = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam("name") String userName, Model model) {
    model.addAttribute("name", userName);
    model.addAttribute("id", id);
    id.incrementAndGet();
    return "greeting";
  }
}
