package com.ty.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String costumerName;
	@OneToMany()
	private List<Item> item;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCostumerName() {
		return costumerName;
	}

	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}

	public List<Item> getItems() {
		return item;
	}

	public void setItems(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "FoodOrder \n[id=" + id + ", \naddress=" + address + ", \ncostumerName=" + costumerName + ", \nitem=" + item
				+ "]";
	}
	
	

}
