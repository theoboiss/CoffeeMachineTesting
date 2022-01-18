package main.java.coffeemachine.coffeemachine.model;

import javax.persistence.*;

@Entity
public class Amounts {
	
	@Id
	private int id;
	
	//liter
	private double water;
	
	//kilograms
	private double sugar;

	
	//constructor
	public Amounts(int id, double water, double sugar) {
		super();
		this.id = id;
		this.water = water;
		this.sugar = sugar;
	}


	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	
	

}
