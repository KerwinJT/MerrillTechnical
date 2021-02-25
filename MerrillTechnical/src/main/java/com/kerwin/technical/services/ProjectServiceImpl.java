package com.kerwin.technical.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kerwin.technical.entities.Project;
import com.kerwin.technical.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository proRepo;
	
	public List<Project> findByUserId(int id){
		return proRepo.findByUserId(id);
	}

}
