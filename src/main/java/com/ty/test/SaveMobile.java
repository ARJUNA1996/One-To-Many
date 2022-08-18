package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.Mobile;
import com.ty.onetomany.Sim;

public class SaveMobile {

	public static void main(String[] args) {

		List<Sim> sims = new ArrayList<Sim>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Mobile m = new Mobile();
		m.setName("SONY");
		m.setCost(29000);
		
		Mobile m1=new Mobile();
		m1.setName("APPLE");
		m1.setCost(59000);

		Sim sim = new Sim();
		sim.setProvider("Airtel");
		sim.setImrc(123);
		sims.add(sim);
		
		Sim sim2 = new Sim();
		sim2.setProvider("BSNL");
		sim2.setImrc(5362);
		sims.add(sim2);
		
		Sim sim3=new Sim();
		sim3.setProvider("JIO");
		sim3.setImrc(5486);
		sims.add(sim3);
		
		m.setSims(sims);
		
		transaction.begin();
		
		manager.persist(m);
		manager.persist(m1);
		manager.persist(sim);
		manager.persist(sim2);
		manager.persist(sim3);
		transaction.commit();
		
 
	}
}
