package com.greenfox.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
//    ObjectMapper mapper = new ObjectMapper();
//    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
  }
}
