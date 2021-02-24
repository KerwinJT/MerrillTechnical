package com.kerwin.technical.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "registereduser")
public class RegisteredUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String city;
	
	private String company;
	
	private String country;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "organizationtype")
	private String organizationType;
	
	private String phone;
	
	private String state;
	
	@Column(name = "zipcode")
	private String zipCode;
	
	@Column(name = "disclaimeraccepted")
	private Boolean disclaimerAccepted;
	
	@Column(name = "languagecode")
	private String languageCode;
	
	@Column (name = "emailaddress")
	private String emailAddress;
	
	public RegisteredUser() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Boolean getDisclaimerAccepted() {
		return disclaimerAccepted;
	}

	public void setDisclaimerAccepted(Boolean disclaimerAccepted) {
		this.disclaimerAccepted = disclaimerAccepted;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public RegisteredUser(int id, String city, String company, String country, String firstName, String lastName,
			String organizationType, String phone, String state, String zipCode, Boolean disclaimerAccepted,
			String languageCode, String emailAddress) {
		super();
		this.id = id;
		this.city = city;
		this.company = company;
		this.country = country;
		this.firstName = firstName;
		this.lastName = lastName;
		this.organizationType = organizationType;
		this.phone = phone;
		this.state = state;
		this.zipCode = zipCode;
		this.disclaimerAccepted = disclaimerAccepted;
		this.languageCode = languageCode;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "RegisteredUser [id=" + id + ", city=" + city + ", company=" + company + ", country=" + country
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", organizationType=" + organizationType
				+ ", phone=" + phone + ", state=" + state + ", zipCode=" + zipCode + ", disclaimerAccepted="
				+ disclaimerAccepted + ", languageCode=" + languageCode + ", emailAddress=" + emailAddress + "]";
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
		RegisteredUser other = (RegisteredUser) obj;
		if (id != other.id)
			return false;
		return true;
	}

		
}
