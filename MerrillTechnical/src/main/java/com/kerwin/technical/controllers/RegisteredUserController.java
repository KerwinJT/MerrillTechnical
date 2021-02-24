package com.kerwin.technical.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kerwin.technical.entities.RegisteredUser;
import com.kerwin.technical.services.RegisteredUserService;

@RestController
@RequestMapping("/registereduser")
public class RegisteredUserController {

	@Autowired
	private RegisteredUserService ruServe;

	@GetMapping("/all")
	public List<RegisteredUser> returnAllRegisteredUsers(HttpServletResponse response) {
		List<RegisteredUser> allRegUsers = ruServe.returnAllRegisteredUsers();
		if (allRegUsers.isEmpty()) {
			response.setStatus(404);
			return null;
		} else {
			response.setStatus(200);
			return allRegUsers;
		}
	}

	@GetMapping("/{id}")
	public RegisteredUser findRegisteredUserById(@PathVariable Integer id, HttpServletResponse response) {
		RegisteredUser userById = ruServe.findRegisteredUserById(id);
		if(userById == null) {
			response.setStatus(200);
		} else {
			response.setStatus(404);
		}
		return userById;
	}
	
//	@PostMapping("/api/registered")


}
