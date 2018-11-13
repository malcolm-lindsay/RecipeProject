package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.service.business.UserService;

@Path("/account")
public class AccountEndpoint {

	@Inject
	private UserService service;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String getAllUsers() {
		return service.getAllUsers();
	}

	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String addUser(String account) {
		return service.addUser(account);
	}

	@Path("/json/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateUser(@PathParam("id") Long id, String account) {
		return service.updateUser(id, account);
	}

	@Path("/json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteUser(@PathParam("id") Long id) {
		return service.deleteUser(id);
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
