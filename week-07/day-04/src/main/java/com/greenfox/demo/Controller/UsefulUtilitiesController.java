package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  @Autowired
  UtilityService myService;

  @GetMapping(value = "/useful")
  public String usefulUtilities() {
    return "UsefulUtilities";
  }

  @GetMapping(value = "/useful/colored")
  public String randomColoredBackground(Model model) {
    model.addAttribute("randomcolor", myService.randomColor());
    return "RandomColors";
  }

  @GetMapping(value = "/useful/email")
  public String randomColoredBackground(@RequestParam("email") String email, Model model) {
    if (myService.isValid(email)) {
      model.addAttribute("validation", email + "is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("validation", email + "is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "Email";
  }

  @GetMapping(value = "/useful/caesarencoder")
  public String caesarEncoder(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("codedtext", myService.caesar(text, number));
    return "Caesar";
  }

  @GetMapping(value = "/useful/caesardecoder")
  public String caesarDecoder(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("codedtext", myService.caesar(text, -number));
    return "Caesar";
  }
}
