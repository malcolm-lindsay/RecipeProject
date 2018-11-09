package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipes {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long RecipeID;
	private String RecipeType;
	private String RecipeAuthor;
	private String DietryInformation;
	private int EstimatedPreparationTime;
	private int ServingSize;
	private String RecipeInstructions;	
	
	public Recipes() {
	}


	public Recipes(Long recipeID, String recipeType, String recipeAuthor, String dietryInformation,
			int estimatedPreparationTime, int servingSize, String recipeInstructions) {
		super();
		this.RecipeID = recipeID;
		this.RecipeType = recipeType;
		this.RecipeAuthor = recipeAuthor;
		this.DietryInformation = dietryInformation;
		this.EstimatedPreparationTime = estimatedPreparationTime;
		this.ServingSize = servingSize;
		this.RecipeInstructions = recipeInstructions;
	}
	
	//Methods; Update Recipe, Delete recipe
	
	
}
