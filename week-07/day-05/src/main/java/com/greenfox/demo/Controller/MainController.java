package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.GreenfoxImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  GreenfoxImages myImages;

  @GetMapping(value = "/")
  public String mainPage(Model model) {
    model.addAttribute("greenfox", myImages.getGreenfox());
    return "Index";
  }
}
