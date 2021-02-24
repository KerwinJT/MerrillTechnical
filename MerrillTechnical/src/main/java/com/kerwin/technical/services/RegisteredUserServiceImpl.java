package com.kerwin.technical.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kerwin.technical.entities.RegisteredUser;
import com.kerwin.technical.repositories.RegisteredUserRepository;


@Service
public class RegisteredUserServiceImpl implements RegisteredUserService {
	
	@Autowired
	private RegisteredUserRepository ruRepo;

	@Override
	public List<RegisteredUser> returnAllRegisteredUsers() {
		return ruRepo.findAll();
	}
	
	public RegisteredUser findRegisteredUserById(Integer id) {
		RegisteredUser regUser = null;
		try {
			regUser = ruRepo.findById(id).get();
		} catch(Exception e) {
			System.out.println(e.getMessage() + " for Registered User by ID: " + id);
		}
		return regUser;
	}

}
