package com.kerwin.technical.entities;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "unregistereduser")
public class UnregisteredUser extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "emailaddress")
	private String emailAddress;
	
	@Column(name = "languagecode")
	private String languageCode;
	
	@Column(name = "registrationid")
	private String registrationId;
	
	@Column(name = "registrationidgeneratedtime")
	private BigInteger registrationIdGeneratedTime;
	
	@Transient
	private List<Integer> projectIds = new ArrayList<Integer>();


	
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

	public List<Integer> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}

	@Override
	public String toString() {
		return "UnregisteredUser [id=" + id + ", emailAddress=" + emailAddress + ", languageCode=" + languageCode
				+ ", registrationId=" + registrationId + ", registrationIdGeneratedTime=" + registrationIdGeneratedTime
				+ "]";
	}
	
	

}
