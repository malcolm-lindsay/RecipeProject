package com.qa.service.business;

public interface RecipeService {

	String getAllRecipes();

	String addRecipe(String account);

	String updateRecipe(Long id, String account);

	String deleteRecipe(Long id);
	
	//search?, by different categories?

}