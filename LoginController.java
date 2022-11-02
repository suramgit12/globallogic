package com.gl.cryptoUsers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.gl.cryptoUsers.bean.Demouser;
import com.gl.cryptoUsers.service.DemouserService;

@RestController
public class LoginController {
	@Autowired
	 private BCryptPasswordEncoder bCrypt;
	@Autowired
	private  DemouserService service;
	
	@GetMapping(value="/register")
	public ModelAndView showUserRegistry(Model model) {
	     Demouser users=new Demouser();
	     ModelAndView mv=new  ModelAndView("registerUserPage");
	     mv.addObject("userRecord",users);
		return mv;
	}
	
	@PostMapping(value="/register")
	public ModelAndView saveUser(@ModelAttribute("userRecord")  Demouser users) {
		String encodedPassword = bCrypt.encode(users.getPassword()); // encryptes the password
		Demouser newUser=new Demouser();
        newUser.setUsername(users.getUsername());
        newUser.setPassword(encodedPassword);
        newUser.setType(users.getType());
         service.save(newUser);
		return new ModelAndView("loginPage");
	}

	
	@GetMapping(value="/loginpage")
	 public ModelAndView showLoginPage() {
		 return new ModelAndView("loginPage");
	 }
		
	 @GetMapping(value="/loginerror")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("loginErrorPage");
	 }
	 

		@GetMapping(value="/index")
		public ModelAndView showIndexPage() {
			String pageName="";
			if(service.getType().equalsIgnoreCase("A"))
				pageName="index1";
			else if(service.getType().equalsIgnoreCase("B"))
				pageName="index2";
			else if(service.getType().equalsIgnoreCase("C"))
				pageName="index3";
			return new ModelAndView(pageName);
		}
}
