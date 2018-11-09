package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Reviews {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int recipeID;
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	composite primary key?
	
	private int userID;
	private String review;
	private int yearOfReview;
	
	public Reviews() {

	}

	public Reviews(int yearOfReview, int recipeID, int userID,String review) {
		this.yearOfReview = yearOfReview;
		this.recipeID= recipeID;
		this.userID = userID;
		this.review = review;
		
	}
}


