package com.kerwin.technical.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kerwin.technical.entities.UnregisteredUser;
import com.kerwin.technical.services.UnregisteredUserService;

@RestController
@RequestMapping("/unregistereduser")
public class UnregisteredUserController {
	
	@Autowired
	private UnregisteredUserService uruServe;
	
	@GetMapping("/all")
	public List<UnregisteredUser> findAllUnregisteredUsers(HttpServletResponse response){
		List<UnregisteredUser> allUnreg = uruServe.findAllUnregisteredUsers();
		if(allUnreg.isEmpty()) {
			response.setStatus(404);
		} else {
			
			response.setStatus(200);
		}
		return allUnreg;
		
	}

}
