package com.kerwin.technical.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kerwin.technical.entities.RegisteredUser;
import com.kerwin.technical.services.RegisteredUserService;

@RestController
public class RegisteredUserController {
	
	@Autowired
	private RegisteredUserService ruServe;
	
	@GetMapping("/api/registereduser/all")
	public List<RegisteredUser> returnAllRegisteredUsers(){
		System.out.println("Calling returnAllRegisteredUsers in Controller");
		return ruServe.returnAllRegisteredUsers();
	}
	
	@GetMapping("/api/registereduser/{id}")
	public RegisteredUser findRegisteredUserById(@PathVariable Integer id) {
		return ruServe.findRegisteredUserById(id);
	}
	
	@GetMapping("/noauth/")
	public String noAuthReturn() {
		return "NoAuth Available";
	}

}
