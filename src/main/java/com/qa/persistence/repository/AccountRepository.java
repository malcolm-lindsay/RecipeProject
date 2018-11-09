package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllUsers();

	String createUser(String accout);

	String updateUser(Long id, String accountToUpdate);

	String deleteUser(Long id);

}