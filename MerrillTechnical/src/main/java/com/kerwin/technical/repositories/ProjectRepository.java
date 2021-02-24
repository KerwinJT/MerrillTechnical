package com.kerwin.technical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kerwin.technical.entities.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
