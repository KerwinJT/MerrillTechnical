package com.kerwin.technical.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kerwin.technical.entities.Project;
import com.kerwin.technical.entities.UnregisteredUser;
import com.kerwin.technical.repositories.UnregisteredUserRepository;


@Service
public class UnregisteredUserServiceImpl implements UnregisteredUserService {
	
	@Autowired
	private UnregisteredUserRepository uruRepo;
	
	@Autowired
	private ProjectService proServe;

	@Override
	public List<UnregisteredUser> findAllUnregisteredUsers() {
		List<UnregisteredUser> allUnreg = uruRepo.findAll();
		if(allUnreg.isEmpty()) {
		} else {
			for(UnregisteredUser unUser: allUnreg) {
				List<Project> projects = proServe.findByUserId(unUser.getId());
				if(!projects.isEmpty()) {
					List<Integer> proIds = new ArrayList<Integer>();
					for(Project project: projects) {
						
						proIds.add(project.getId());
					}
					unUser.setProjectIds(proIds);
				}
				
				
			}
			
		}
		return allUnreg;
	}

}
