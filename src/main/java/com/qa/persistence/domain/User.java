package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long userID;
	private String firstName;
	private String secondName;
	private String accountNumber;
	private String DietryRequirements;
	private String Country;
	private String City;
	private String EmailAddress;
	private int yearOfBirth;
	
	// date?? 

	public User() {

	}

	public User(Long userID, String firstName, String secondName, String accountNumber, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.secondName = secondName;
		this.accountNumber = accountNumber;
		DietryRequirements = dietryRequirements;
		Country = country;
		City = city;
		EmailAddress = emailAddress;
		this.yearOfBirth = yearOfBirth;
	}
}
