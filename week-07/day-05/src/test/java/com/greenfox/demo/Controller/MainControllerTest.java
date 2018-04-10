package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.Fox;
import com.greenfox.demo.Model.Foxlist;
import com.greenfox.demo.Model.GreenfoxImages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class MainControllerTest {

  @MockBean
  GreenfoxImages image;

  @MockBean
  Fox myFox;

  @MockBean
  Foxlist myList;

  private MockMvc mockMvc;

  @Test
  public void checkLoginPageGetRequest() {
    try {
      mockMvc.perform(get("/login"))
          .andExpect(status().isOk());
    } catch (Exception e) {
      System.out.println("Testing");
    }
  }

  @Test
  public void checkLoginPagePostRequest() {
    try {
      mockMvc.perform(get("/"))
          .andExpect(status().isOk());
    } catch (Exception e) {
      System.out.println("Testing");
    }
  }

  @Test
  public void greenfoxImageIsThere() {
    try {
      mockMvc.perform(get("/"))
          .andExpect(model().attribute("greenfox", hasItem(allOf(hasProperty("greenfox", is("greenfox.png"))))));
    } catch (Exception e) {
      System.out.println("Testing");
    }
  }

  @Test
  public void checkLoginPageReturn() {
    try {
      mockMvc.perform(get("/login"))
          .andExpect(content().string("Login"));
    } catch (Exception e) {
      System.out.println("Testing");
    }
  }
}