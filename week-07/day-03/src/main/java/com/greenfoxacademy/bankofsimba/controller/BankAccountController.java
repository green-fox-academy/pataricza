package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    model.addAttribute("bankaccount", new BankAccount("Simba", 2000, "lion", true, true));
    return "BankAccountFields";
  }
}
