package com.kerwin.technical.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unregistered_user")
public class UnregisteredUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String emailAddress;
	
	private String languageCode;
	
	private String registrationId;
	
	private BigInteger registrationIdGeneratedTime;

}
