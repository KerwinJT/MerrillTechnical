package com.kerwin.technical.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UnregisteredUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String emailAddress;
	
	private String languageCode;
	
	private String registrationId;
	
	private BigInteger registrationIdGeneratedTime;
	
	public UnregisteredUser() {
		super();
	}

	public UnregisteredUser(int id, String emailAddress, String languageCode, String registrationId,
			BigInteger registrationIdGeneratedTime) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.languageCode = languageCode;
		this.registrationId = registrationId;
		this.registrationIdGeneratedTime = registrationIdGeneratedTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnregisteredUser other = (UnregisteredUser) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public BigInteger getRegistrationIdGeneratedTime() {
		return registrationIdGeneratedTime;
	}

	public void setRegistrationIdGeneratedTime(BigInteger registrationIdGeneratedTime) {
		this.registrationIdGeneratedTime = registrationIdGeneratedTime;
	}

	@Override
	public String toString() {
		return "UnregisteredUser [id=" + id + ", emailAddress=" + emailAddress + ", languageCode=" + languageCode
				+ ", registrationId=" + registrationId + ", registrationIdGeneratedTime=" + registrationIdGeneratedTime
				+ "]";
	}
	
	

}
