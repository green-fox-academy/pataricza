package com.greenfox.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianController.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootResponse() throws Exception {
    mockMvc.perform(get("/groot").param("message", "valami"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received").value("valami"))
        .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void grootErrorResponse() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void arrowResponse() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100")
                                            .param("time", "10"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance").value(100.0))
        .andExpect(jsonPath("$.time").value(10.0))
        .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void arrowNoParamResponse() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().is4xxClientError());
  }
}