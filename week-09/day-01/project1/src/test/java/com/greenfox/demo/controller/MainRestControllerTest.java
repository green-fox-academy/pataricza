package com.greenfox.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainRestController.class)
@WebAppConfiguration
@EnableWebMvc
public class MainRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void returnDoubleExpect10Test() throws Exception {
    mockMvc.perform(get("/doubling").param("input", "5"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received").value(5))
        .andExpect(jsonPath("$.result").value(10));
  }

  @Test
  public void returnDoubleExpectErrorTest() throws Exception {
    mockMvc.perform(get("/doubling"))
        .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }

  @Test
  public void returnGreetingWithNameAndTitle() throws Exception {
    mockMvc.perform(get("/greeter").param("name", "petike").param("title", "student"))
           .andExpect(status().isOk())
           .andExpect(jsonPath("$.welcome_message").value("Oh, hi there petike, my dear student!"));
  }

  @Test
  public void returnGreetingProvideName() throws Exception {
    mockMvc.perform(get("/greeter"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }

  @Test
  public void appendAKutyA() throws Exception {
    mockMvc.perform(get("/appenda/{appendable}", "kuty"))
        .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void appendA404() throws Exception {
    mockMvc.perform(get("/appenda"))
        .andExpect(status().is4xxClientError());
  }

  @Test
  public void doUntilSum() throws Exception {
    mockMvc.perform(post("/dountil/{what}", "sum")
        .contentType(contentType)
        .content("{\"until\": 5}"))
        .andExpect(jsonPath("$.result").value(15));
  }

  @Test
  public void doUntilSumError() throws Exception {
    mockMvc.perform(post("/dountil/{what}", "sum"))
        .andExpect(jsonPath("$.error").value("Please provide a number!"));
  }

  @Test
  public void doUntilFac() throws Exception {
    mockMvc.perform(post("/dountil/{what}", "factor")
        .contentType(contentType)
        .content("{\"until\": 4}"))
        .andExpect(jsonPath("$.result").value(24));
  }
}