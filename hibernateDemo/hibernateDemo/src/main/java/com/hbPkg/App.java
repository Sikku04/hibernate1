package com.hbPkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbPkg.model.UserInfo;
import com.hbPkg.model.UserName;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*
		 * Save Data UserInfo userInfo = new UserInfo(); userInfo.setName("Dev");
		 * userInfo.setLastName("Saini");
		 * 
		 * Configuration con = new
		 * Configuration().configure().addAnnotatedClass(UserInfo.class); SessionFactory
		 * sf = con.buildSessionFactory(); Session session = sf.openSession();
		 * Transaction ts = session.beginTransaction(); session.save(userInfo);
		 * ts.commit(); System.out.println(""); System.out.println("Save Success");
		 */

		// Featch Data

		// UserInfo userInfo = null;
		// Configuration con = new
		// Configuration().configure().addAnnotatedClass(UserInfo.class);
		// SessionFactory sf = con.buildSessionFactory();
		// Session session = sf.openSession();
		// Transaction ts = session.beginTransaction();
		// userInfo = (UserInfo) session.get(UserInfo.class, 1L);
		// get() :::::: UserInfo [id=1, Name=Sikandar, lastName=Saini]
		// load() :::::: UserInfo [id=1, Name=Sikandar, lastName=Saini]
		// ts.commit();
		// System.out.println("");
		// System.out.println("::::::" + userInfo);

		UserName am = new UserName();
		am.setfName("Jugal");
		am.setmName("Kumar");
		am.setlName("Saini");

		UserInfo userInfo = new UserInfo();
		userInfo.setUserName(am);
		userInfo.setNameColor("Green");
		Configuration con = new Configuration().configure().addAnnotatedClass(UserInfo.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		session.save(userInfo);
		ts.commit();
		System.out.println("Save Success");

	}
}
