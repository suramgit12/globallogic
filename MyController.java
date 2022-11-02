package com.gl.cryptoUsers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	@GetMapping(value="/addition")
	 public String showAdditionPage() {
		 return "Addition Page";
	 }
	
	@GetMapping(value="/updation")
	 public String showUpdationPage() {
		 return "Updation Page";
	 }
	@GetMapping(value="/deletion")
	 public String showDeletionPage() {
		 return "Deletion Page";
	 }

}
