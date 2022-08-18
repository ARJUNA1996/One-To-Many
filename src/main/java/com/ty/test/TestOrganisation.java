package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.Bus;
import com.ty.onetomany.Organisation;

public class TestOrganisation {
	
	public static void main(String[] args) {
		
		List<Bus> list=new ArrayList<Bus>();
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		
		Organisation organisation=new Organisation();
		organisation.setName("KSRTC");
		organisation.setAddress("MEJISTIC");
		
		Bus bus = new Bus();
		bus.setCapacity(24);
		bus.setType("LUXURY");
		
		list.add(bus);
		
		Bus bus1 = new Bus();
		bus1.setCapacity(23);
		bus1.setType("L");
		
		list.add(bus1);
		
		Bus bus2 = new Bus();
		bus2.setCapacity(21);
		bus2.setType("LUURY");
		list.add(bus2);
		
		organisation.setBus(list);
		
		
		transaction.begin();
		
		manager.persist(organisation);
		manager.persist(bus);
		manager.persist(bus1);
		manager.persist(bus2);
		transaction.commit();
				
		
		
		
	}

}
