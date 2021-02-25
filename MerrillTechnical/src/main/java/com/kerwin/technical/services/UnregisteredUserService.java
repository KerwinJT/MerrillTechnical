package com.kerwin.technical.services;

import java.util.List;

import com.kerwin.technical.entities.UnregisteredUser;

public interface UnregisteredUserService {
	
	List<UnregisteredUser> findAllUnregisteredUsers();

}
