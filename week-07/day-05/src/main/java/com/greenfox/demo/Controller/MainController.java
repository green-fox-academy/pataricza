package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.Fox;
import com.greenfox.demo.Model.GreenfoxImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  GreenfoxImages myImages;
  @Autowired
  Fox myFox;

  @GetMapping(value = "/")
  public String mainPage(@RequestParam(name = "foxname", required = false) String foxname, Model model) {
    model.addAttribute("greenfox", myImages.getGreenfox());
    if (myFox.getName() == null) {
      model.addAttribute("foxname", "MR.Fox");
    } else {
      model.addAttribute("foxname", myFox.getName());
    }
    return "Index";
  }

  @GetMapping(value = "/login")
  public String loginPage() {
    return "Login";
  }

  @PostMapping(value = "/login")
  public String loggedInPage(@ModelAttribute(name = "foxname") String foxname) {
    myFox.setName(foxname);
    return "redirect:/?foxname=" + foxname;
  }
}
