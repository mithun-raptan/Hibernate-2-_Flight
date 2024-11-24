package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllRecords {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		//TCL is not required to fetch the records.
		Query q =em.createQuery("select f from Flight f");
		List<Flight> l=q.getResultList();
		if(!l.isEmpty()) {
			for(Flight s : l) {
				System.out.println(s.getName());
			}
		}
		else {
			System.out.println("record not present");
		}
	}

}
