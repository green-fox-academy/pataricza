package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.ListOfAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MultipleAccountController {

  @GetMapping(value = "/multipleAccount")
  public String showAccount(Model model) {
    model.addAttribute("accountList", new ListOfAccounts());
    return "MultipleAccountToTable";
  }
}
