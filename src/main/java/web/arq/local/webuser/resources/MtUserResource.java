package web.arq.local.webuser.resources;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import web.arq.local.webuser.model.MtUser;
import web.arq.local.webuser.service.MtUserService;

@Path("/users")
@Singleton
public class MtUserResource {

	MtUserService userService = new MtUserService();
	// private int count;

	// get all users
	/*@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<MtUser> getUsers() {
		return userService.getAllUsers();

	}*/
	
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<MtUser> getUsers2() {
		return userService.getAllUsers2();

	}
	

	// get user by id
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/{userId}")
	public MtUser getUser(@PathParam("userId") long userId) {
		return userService.getUser(userId);

	}

	// create new user
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Path("/{userId}")
	public MtUser createUser(MtUser user) {
		return userService.addUser(user);

	}

	/*
	 * //get count
	 * 
	 * @GET
	 * 
	 * @Path("/count")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String getUser() { count ++; return
	 * "Veces " + count;
	 * 
	 * }
	 */

}
