package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.StudentService;
import com.greenfox.demo.Model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

  @Autowired
  StudentService myService;

  @GetMapping(value = "/gfa")
  public String greenFoxMain(Model model) {
    return "GreenFoxMain";
  }

  @GetMapping(value = "/gfa/list")
  public String listOfStudents(Model model) {
    model.addAttribute("list", myService.findAll());
    return "ListOfStudents";
  }

  @GetMapping(value = "/gfa/add")
  public String addNewStudents() {
    return "AddNewStudentForm";
  }

  @PostMapping(value = "/gfa/add/save")
  public String saveNewStudents(@ModelAttribute("studentname") String name) {
    myService.save(name);
    return "AddNewStudentForm";
  }
}
