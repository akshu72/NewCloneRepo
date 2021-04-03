package com.cjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping("/Hello")
  public String sayHi()
  {
	  return "Hi Spring Security";
  }
}
