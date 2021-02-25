package com.kerwin.technical.services;

import java.util.List;

import com.kerwin.technical.entities.Project;

public interface ProjectService {
	
	List<Project> findByUserId(int id);

}
