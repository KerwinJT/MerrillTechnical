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
		System.out.println("Found\n" + ruRepo.findAll());
		// TODO Auto-generated method stub
		return ruRepo.findAll();
	}
	
	public RegisteredUser findRegisteredUserById(Integer id) {
		System.out.println(ruRepo.findById(id).get());
		return ruRepo.findById(id).get();
	}

}
