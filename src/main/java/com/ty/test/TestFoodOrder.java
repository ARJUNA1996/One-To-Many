package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.FoodOrder;
import com.ty.onetomany.Item;

public class TestFoodOrder {

	

	public static void main(String[] args) {
		
		List<Item> items = new ArrayList<Item>();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		FoodOrder od1 = new FoodOrder();

		od1.setCostumerName("Mallikarjuna");
		od1.setAddress("Btm");
		od1.setItems(items);

		FoodOrder od2 = new FoodOrder();

		od2.setCostumerName("Mallikarjuna");
		od2.setAddress("Btm");
		//od2.setItems(items);
		

		Item item1 = new Item();
		item1.setName("BIRIYANI");
		item1.setQty(2);
		item1.setCost(399.00);
		
		items.add(item1);
		
		Item item2 = new Item();
		item2.setName("BIRIYANI");
		item2.setQty(2);
		item2.setCost(399.00);
		
		items.add(item2);
		
		Item item3 = new Item();
		item3.setName("CHICKEN CHILLI");
		item3.setQty(2);
		item3.setCost(399.00);
		
		items.add(item3);
		
		Item item4 = new Item();
		item4.setName("MASALA");
		item4.setQty(2);
		item4.setCost(399.00);
		
		items.add(item4);
		
		Item item5 = new Item();
		item5.setName("MASALA");
		item5.setQty(2);
		item5.setCost(399.00);
		
		items.add(item5);
		
		
		
		
		transaction.begin();
		manager.persist(od1);
		manager.persist(od2);
		manager.persist(item1);
		manager.persist(item2);
		manager.persist(item3);
		manager.persist(item4);
		manager.persist(item5);
		transaction.commit();
		
		
		
		
		
		
		
		
		
		

	}

}
