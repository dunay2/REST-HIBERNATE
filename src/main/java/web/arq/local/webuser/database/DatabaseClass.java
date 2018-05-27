package web.arq.local.webuser.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import web.arq.local.webuser.model.MtUser;

/**
 * 
 * Hacer pruebas
 * 
 * @author ashh412
 *
 */

public class DatabaseClass {

	private static Map<Long, MtUser> users = new HashMap<>();

	public static Map<Long, MtUser> getUsers() {
		return users;

	}

	public static List getUsers2() {
		//
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		return session.createQuery("from MtUser").list();
	}

	

	public static void save(MtUser instance)

	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(instance);
		session.getTransaction().commit();
		session.close();
	}

}
