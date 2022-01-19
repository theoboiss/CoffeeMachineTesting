package coffeemachine.coffeemachine.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Drink {

	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;

	private String name;

	private String description;

	private double price;

	private int quantity;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "drink")
	private List<DrinkOrder> orders;


	//constructor
	public Drink() {
		super();
	}

	public Drink(String name, String description, double price, int quantity, List<DrinkOrder> orders) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.orders = orders;
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


	public List<DrinkOrder> getOrders() {
		return orders;
	}


	public void setOrders(List<DrinkOrder> orders) {
		this.orders = orders;
	}



}
