package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.model.FormResponse;
import com.greenfoxacademy.bankofsimba.model.ListOfAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MultipleAccountController {

  private FormResponse myFormresponse;
  private ListOfAccounts myAccountlist = new ListOfAccounts();

  @GetMapping(value = "/multipleAccount")
  public String showAccount(Model model) {
    model.addAttribute("accountList", myAccountlist);
    model.addAttribute("formResponse", new FormResponse());
    return "MultipleAccountToTable";
  }

  @PostMapping(value = "/multipleAccount/raise")
  public String raiseBalance(@ModelAttribute FormResponse formResponse) {
    myAccountlist.raiseOneAccount(Integer.parseInt(formResponse.getIndex()));
    return "redirect:/multipleAccount";
  }

  @PostMapping("/increment")
  public String incrementBalanceSubmit(@ModelAttribute(value = "id") Integer id) {
    myAccountlist.raiseOneAccount(id);
    return "redirect:/multipleAccount";
  }
}
