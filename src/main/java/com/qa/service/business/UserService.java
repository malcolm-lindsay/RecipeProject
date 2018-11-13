package com.qa.service.business;

public interface UserService {

	String getAllUsers();

	String addUser(String account);

	String updateUser(Long id, String account);

	String deleteUser(Long id);

}