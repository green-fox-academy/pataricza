package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLceptionController {

  @GetMapping(value = "/ception")
  public String showAccount(Model model) {
    model.addAttribute("ception", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "HTMLception";
  }
}
