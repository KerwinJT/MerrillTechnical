package com.kerwin.technical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kerwin.technical.entities.UnregisteredUser;

@Repository
public interface UnregisteredUserRepository extends JpaRepository<UnregisteredUser, Integer> {

}
