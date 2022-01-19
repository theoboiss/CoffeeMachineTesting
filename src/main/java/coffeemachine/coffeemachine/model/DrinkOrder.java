package coffeemachine.coffeemachine.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class DrinkOrder {

	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;

	private Date date;

	@ManyToOne
	private Drink drink;

	private double size;

	private boolean withPaperCup;

	private double sugar;

	private double price;

	private boolean ordered;


	//constructor
	public DrinkOrder(Date date, Drink drink, double size, boolean withPaperCup, double sugar, double price,
					  boolean ordered) {
		super();
		this.date = date;
		this.drink = drink;
		this.size = size;
		this.withPaperCup = withPaperCup;
		this.sugar = sugar;
		this.price = price;
		this.ordered = ordered;
	}


	//getters and setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Drink getDrink() {
		return drink;
	}


	public void setDrink(Drink drink) {
		this.drink = drink;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public boolean isWithPaperCup() {
		return withPaperCup;
	}


	public void setWithPaperCup(boolean withPaperCup) {
		this.withPaperCup = withPaperCup;
	}


	public double getSugar() {
		return sugar;
	}


	public void setSugar(double sugar) {
		this.sugar = sugar;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isOrdered() {
		return ordered;
	}


	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
	}


}
