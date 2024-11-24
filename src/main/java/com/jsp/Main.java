package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		//create @Entity annotation object
		Flight c = new Flight();
		c.setId(101);
		c.setName("mithun");
		c.setEmail("m@g.com");
		c.setTransactionAmount(6069);
		c.setStatus(true);
		
		//TCL transaction
		et.begin();
		em.persist(c);
		et.commit();
	}
}
