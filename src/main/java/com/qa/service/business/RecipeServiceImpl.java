package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.UserRepository;
//^change to recipe repository
public class RecipeServiceImpl implements RecipeService {

	private static final Logger LOGGER = Logger.getLogger(UserService.class);

	@Inject
	private UserRepository repo;

	public String getAllRecipes() {
		LOGGER.info("In AccountServiceImpl getAllAccounts ");
		return repo.getAllUsers();
	}

	public String addRecipe(String account) {
		return repo.createUser(account);
	}

	public String updateRecipe(Long id, String account) {
		return repo.updateUser(id, account);
	}

	public String deleteRecipe(Long id) {
		return repo.deleteUser(id);

	}

	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}
}
