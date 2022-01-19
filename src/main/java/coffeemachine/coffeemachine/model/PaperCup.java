package coffeemachine.coffeemachine.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaperCup {

	@Id
	private double size;
	
	private double price;
	
	private int quantity;

	
	//constructor
	public PaperCup(double size, double price, int quantity) {
		super();
		this.size = size;
		this.price = price;
		this.quantity = quantity;
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
