package web.arq.local.webuser.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import web.arq.local.webuser.database.DatabaseClass;
import web.arq.local.webuser.model.*;

public class MtUserService {

	private static Map<Long, MtUser> users = DatabaseClass.getUsers();
	private static List users2 = DatabaseClass.getUsers2();
	
	

	public MtUserService() {

		MtUser user1 = new MtUser();

		user1.setName("nuevo u1");
		user1.setPassword("Passowrd");

		MtRole role = new MtRole("STANDAR");

		user1.getRoles().add(role);

		users.put(1L, user1);
		user1 = new MtUser();
		user1.setName("nuevo u1");
		user1.setPassword("Passowrd");

		users.put(2L, new MtUser());

	}

	public List<MtUser> getAllUsers() {

		return new ArrayList<MtUser>(users.values());
		
		
		
	}
	
	public List<MtUser> getAllUsers2() {

		return  users2;//  ArrayList<MtUser>(users.values());
		
		
		
	}
	
	

	public MtUser addUser(MtUser user) {
		user.setIdUser(users.size() + 1);
		users.put(user.getIdUser(), user);

		return user;
	}

	public MtUser getUser(long id) {
		return users.get(id);

	}

}
