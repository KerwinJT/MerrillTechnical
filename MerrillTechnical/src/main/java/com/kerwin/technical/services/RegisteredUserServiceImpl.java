package com.kerwin.technical.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kerwin.technical.entities.Project;
import com.kerwin.technical.entities.RegisteredUser;
import com.kerwin.technical.repositories.RegisteredUserRepository;


@Service
public class RegisteredUserServiceImpl implements RegisteredUserService {
	
	@Autowired
	private RegisteredUserRepository ruRepo;
	
	@Autowired
	private ProjectService proServe;

	@Override
	public List<RegisteredUser> findAllRegisteredUsers() {
		List<RegisteredUser> allRegUsers = ruRepo.findAll();
		if (allRegUsers.isEmpty()) {
			return null;
		} else {
			for(RegisteredUser rUser: allRegUsers) {
				List<Project> projects = proServe.findByUserId(rUser.getId());
				if(!projects.isEmpty()) {
					List<Integer> proIds = new ArrayList<Integer>();
					for(Project project: projects) {
						
						proIds.add(project.getId());
					}
					rUser.setProjectIds(proIds);
				}
			}
			return allRegUsers;
		}
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
