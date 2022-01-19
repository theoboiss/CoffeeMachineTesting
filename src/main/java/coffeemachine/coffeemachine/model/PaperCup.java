package coffeemachine.coffeemachine.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class PaperCup {

	@Id
	private double size;

	private double price;

	private int quantity;


	//constructor
	public PaperCup(double size, double price, int quantity, List<DrinkOrder> orders) {
		super();
		this.size = size;
		this.price = price;
		this.quantity = quantity;
	}

	public PaperCup() {
		super();
	}


	//getters and setters
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
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
