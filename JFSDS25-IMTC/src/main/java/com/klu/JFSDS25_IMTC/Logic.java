package com.klu.JFSDS25_IMTC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		
		Card c=new Card();
		Cheque cq=new Cheque();
		
		c.setPid(101);
		c.setPamount(145000);
		c.setCardType("Credit Card");

		cq.setPid(201);
		cq.setPamount(140000);
		cq.setChequeType("RTGS");

		s.save(c);
		s.save(cq);

		t.commit();
		s.close();
	   sf.close();

	}

}
