package com.nt.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.serviceImpl;

@Controller
@RequestMapping("/Cuntrry/")
public class ControllerClass {
	@Autowired
	private serviceImpl service;
@RequestMapping("/")
	public String home() {
	System.out.println("ControllerClass.home()");
	return "home";
}
	
@RequestMapping("/register")
public String Regsiter() {
	return "register";
}

  @ModelAttribute("coutriesInfo") 
  public Set<String>getContries(){//these methoed excuted for avery reues
  System.out.println("ControllerClass.getContries()===============");
  
  System.out.println("ControllerClass.getContries()===ajay");
  Set<String>countrySet=service.getAllCountry(); 
  System.out.println(countrySet);
  System.out.println("-----------------------");
  
  System.out.println("countriesInfo");
  return countrySet; }
 }
