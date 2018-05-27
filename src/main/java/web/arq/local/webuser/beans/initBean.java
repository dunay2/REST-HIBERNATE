package web.arq.local.webuser.beans;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Singleton;

import web.arq.local.webuser.database.UserFacade;
import web.arq.local.webuser.model.MtUser;


@Startup
@Singleton
public class initBean {

	/**
	 * Crear usuarios al inicio
	 * 
	 */
	@Inject
	UserFacade mT_UserFacade;

	@PostConstruct
	private void init() {

		MtUser user = new MtUser();

		user.setName("Nombre user en inicio");
		user.setPassword("Password");

		mT_UserFacade.create(user);

	}

}
