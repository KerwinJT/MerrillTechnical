package com.kerwin.technical.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kerwin.technical.entities.RegisteredUser;
import com.kerwin.technical.entities.UnregisteredUser;
import com.kerwin.technical.services.RegisteredUserService;
import com.kerwin.technical.services.UnregisteredUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private RegisteredUserService ruServe;
	
	@Autowired
	private UnregisteredUserService unServe;
	
	@GetMapping("/all")
	public List<List> findAllUsers(HttpServletResponse response){
		
		List<List> listUsers = new ArrayList<List>();
		
		List<RegisteredUser> allRegUsers = ruServe.findAllRegisteredUsers();
		List<UnregisteredUser> allUnRegUsers = unServe.findAllUnregisteredUsers();
		if(!allRegUsers.isEmpty()) {
			listUsers.add(allRegUsers);
		}
		if(!allUnRegUsers.isEmpty()) {
			listUsers.add(allUnRegUsers);
		}
		
		return listUsers;
	}

}
