package com.qa.service.business;

public interface ReviewService {

	String getAllUsers();

	String addReview(String account);

	String updateUser(Long id, String account);

	String deleteUser(Long id);

}