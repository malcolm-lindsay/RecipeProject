package com.qa.persistence.repository;

public interface UserRepository {

	String getAllUsers();

	String createUser(String accout);

	String updateUser(Long id, String accountToUpdate);

	String deleteUser(Long id);

}