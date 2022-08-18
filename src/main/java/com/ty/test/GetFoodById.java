package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.FoodOrder;

public class GetFoodById {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		FoodOrder order=manager.find(FoodOrder.class, 1);
		
		if(order!=null) {
			System.out.println(order);
		}
		else {
			System.out.println("element is not found in dataase");
		}
		
	}

}
