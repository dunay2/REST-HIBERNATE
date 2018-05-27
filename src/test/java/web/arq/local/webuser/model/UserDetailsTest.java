package web.arq.local.webuser.model;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javassist.bytecode.Descriptor.Iterator;
import web.arq.local.webuser.service.MtUserService;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//

public class UserDetailsTest {

	@Test
	public void testGetUserName() {
		System.out.println("getUserName");

		UserDetails instance = new UserDetails();

		String expResult = "userName";
		instance.setUserName("userName");
		;
		String result = instance.getUserName();
		assertEquals(expResult, result);

	}

	/// *
	// * To change this license header, choose License Headers in Project
	/// Properties.
	// * To change this template file, choose Tools | Templates
	// * and open the template in the editor.
	// */
	// package model;
	//
	//

	/// **
	// *
	// * @author ashh412
	// */
	// public class UserTest {
	//
	// public UserTest() {
	// }
	//
	// @BeforeClass
	// public static void setUpClass() {
	// }
	//
	// @AfterClass
	// public static void tearDownClass() {
	// }
	//
	// @Before
	// public void setUp() {
	// }
	//
	// @After
	// public void tearDown() {
	// }
	//

	// }
	//

	// /**
	// * Test of getName method, of class User.
	// */
	// @Test
	// public void testGetName() {
	// System.out.println("getName");
	// MtUser instance = new MtUser(1,"name","");
	// String expResult = "name";
	// String result = instance.getName();
	// assertEquals(expResult, result);
	// }
	//
	// /**
	// * Test of setName method, of class User.
	// */
	// @Test
	// public void testSetName() {
	// System.out.println("setName");
	// String name = "myName";
	// String expResult = "myName";
	// MtUser instance = new MtUser();
	// instance.setName(name);
	// String result = instance.getName();
	// assertEquals(expResult, result);
	//
	// }
	//
	// /**
	// * Test of getPassword method, of class User.
	// */
	// @Test
	// public void testGetPassword() {
	// System.out.println("getPassword");
	// MtUser instance = new MtUser(1, "", "pwd");
	// String expResult = "pwd";
	// String result = instance.getPassword();
	//
	// assertEquals(expResult, result);
	// // TODO review the generated test code and remove the default call to fail.
	//
	// }
	//
	// /**
	// * Test of setPassword method, of class User.
	// */
	// @Test
	// public void testSetPassword() {
	// System.out.println("setPassword");
	// String password = "pwd";
	// MtUser instance = new MtUser();
	// instance.setPassword(password);
	//
	// Assert.assertEquals("pwd", instance.getPassword());
	// // TODO review the generated test code and remove the default call to fail.
	//
	// }
	//
	// }

	// package model;
	//
	// import java.io.File;
	//
	// import org.hibernate.SessionFactory;
	// import org.hibernate.cfg.AnnotationConfiguration;
	// import org.hibernate.cfg.Configuration;
	//
	// public class HibernateUtil {
	// private static final SessionFactory sessionFactory = buildSessionFactory();
	//
	// private static SessionFactory buildSessionFactory() {
	// try {
	// // Create the SessionFactory from hibernate.cfg.xml
	// Configuration config = new AnnotationConfiguration().configure(new
	// File("D:\\Latest
	// Setup\\eclipse_juno_workspace\\hibernate-test-project\\hibernate.cfg.xml"));
	// return config.buildSessionFactory();
	//
	// }
	// catch (Throwable ex) {
	// // Make sure you log the exception, as it might be swallowed
	// System.err.println("Initial SessionFactory creation failed." + ex);
	// throw new ExceptionInInitializerError(ex);
	// }
	// }
	//
	// public static SessionFactory getSessionFactory() {
	// return sessionFactory;
	// }
	//
	// public static void shutdown() {
	// // Close caches and connection pools
	// getSessionFactory().close();
	// }
	// }

	@Test
	public void testCreate() {
		System.out.println("Hibernate");
		System.out.println("************* ");
		UserDetails instance = new UserDetails();
		System.out.println("************* ");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("************* ");
		Session session = sessionFactory.openSession();
		System.out.println("************* ");
		MtRole intanceRole = new MtRole();
		intanceRole.setRoleName("STANDAR");

		instance.setIdUser(1);
		instance.setUserName("User 1");
		instance.setPassword("password");
		instance.addRole(intanceRole);

		System.out.println("************* ");

		session.beginTransaction();
		session.save(instance);
		session.getTransaction().commit();

		System.out.println("id es " + instance.getIdUser());
		System.out.println("user es " + instance.getUserName());
		System.out.println("password es " + instance.getPassword());

		instance = new UserDetails();

		instance.setIdUser(2);
		instance.setUserName("User 2");
		instance.setPassword("password");
		instance.addRole(intanceRole);

		session.beginTransaction();
		session.save(instance);
		session.getTransaction().commit();

		System.out.println("id es " + instance.getIdUser());
		System.out.println("user es " + instance.getUserName());
		System.out.println("password es " + instance.getPassword());

		/*
		 * instance.setIdUser(3); instance.setUserName("User 3");
		 * instance.setPassword("password");
		 * 
		 * session.beginTransaction(); session.save(instance);
		 * session.getTransaction().commit();
		 * 
		 * System.out.println("id es " + instance.getIdUser());
		 * System.out.println("user es " + instance.getUserName());
		 * System.out.println("password es " + instance.getPassword())
		 */;

		// session.close();

		/*
		 * Session session = factory.getCurrentSession(); Foo foo = (Foo)
		 * session.get(Foo.class, 1);
		 * 
		 * // Verificamos la clase del objeto assertSame(foo.getClass(), Foo.class);
		 */

		// Create the SessionFactory from hibernate.cfg.xml

		/*
		 * try {
		 * 
		 * 
		 * } catch (HibernateException exception) {
		 * System.out.println("Problem creating session factory");
		 * exception.printStackTrace(); }
		 */

		System.out.println("Hibernate get");

		instance = null;

		session.beginTransaction();

		// instance = (UserDetails) session.get(UserDetails.class, 26);
		instance = (UserDetails) session.get(UserDetails.class, 79L);

		System.out.println("user es " + instance.getUserName());

		System.out.println("cantidad roles es " + instance.getRoles().size());
		session.close();

		System.out.println("**************");
		/*
		 * if (instance.getRoles().size()>0) { Iterator it = (Iterator)
		 * instance.getRoles().iterator();
		 * 
		 * while (it.hasNext()) { intanceRole= it.next(); }
		 * 
		 * }
		 */

		// return config.buildSessionFactory();
		//
		// }
		// catch (Throwable ex) {
		// // Make sure you log the exception, as it might be swallowed
		// System.err.println("Initial SessionFactory creation failed." + ex);
		// throw new ExceptionInInitializerError(ex);

	}

	@Test
	public void testGetAllUsers2() {
		System.out.println("*********a*****");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("*********a*****");
		Session session = sessionFactory.openSession();
		System.out.println("*********a*****");
		session.beginTransaction();
		System.out.println("*********a*****");
		session.createQuery("from MtUser").list();
		System.out.println("*********a*****");
		session.close();
		System.out.println("*********a*****");
		// MtUserService userService = new MtUserService();

	}

	@Test
	public void testGetAllUsers() {

		System.out.println("*****Hibernate testGetAllUsers ");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

/*		System.out.println("*********a*****");
		Query query = session.getNamedQuery("UserDetails.byId");
		query.setLong(0, 55L);*/

		System.out.println("*******b*******");
	//	List<?> users = query.list();
		System.out.println("**********c****");
		session.getTransaction().commit();
		System.out.println("*********d*****");
		session.close();
		System.out.println("**********e****");
	//	System.out.println("size es " + users.size());
		System.out.println("****Fin Hibernate testGetAllUsers ");

	}
	
	
	
	
	
	@Test
	public void testTODO() {
		System.out.println("Hibernate todo");
		System.out.println("************* ");
	//	UserDetails instance = new UserDetails();
		System.out.println("************* ");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("************* ");
		Session session = sessionFactory.openSession();
		System.out.println("************* ");

	
		System.out.println("Hibernate get");

		UserDetails instance = new UserDetails();

		session.beginTransaction();
		System.out.println("************* ");
		//instance = (UserDetails) session.get(UserDetails.class, 79L);
		session.createQuery("from MtUser").list();
		System.out.println("************* ");
		System.out.println("user es " + instance.getUserName());

		System.out.println("cantidad roles es " + instance.getRoles().size());
		session.close();

		System.out.println("************* ");
	


	}
	
}
