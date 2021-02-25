package com.kerwin.technical.services;

import java.util.List;

import com.kerwin.technical.entities.RegisteredUser;

public interface RegisteredUserService {
	
	List<RegisteredUser> findAllRegisteredUsers();
	RegisteredUser findRegisteredUserById(Integer id);

}
