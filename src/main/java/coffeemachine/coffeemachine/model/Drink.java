package main.java.coffeemachine.coffeemachine.model;

import javax.persistence.*;

@Entity
public class Drink {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int number;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private int quantity;
	
	
	//constructor
	
	public Drink(String name, String description, double price, int quantity) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}


	
	//getters and setters
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
