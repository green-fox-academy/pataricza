package com.greenfox.demo.Controller;

import com.greenfox.demo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"/todo/", "/todo/list"})
  public String list(@RequestParam(name = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findAllByDone(isActive));
      return "todoslist";
    } else {
      model.addAttribute("todos", todoRepository.findAll());
      return "todoslist";
    }
  }
}
