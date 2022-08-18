package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.Mobile;

public class GetMobileById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		Mobile mobile=manager.find(Mobile.class, 2);
		
		if(mobile!=null) {
			System.out.println(mobile);
		}
		else {
			System.out.println("element is not found in dataase");
		}
		
	}

}
