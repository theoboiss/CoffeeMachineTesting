package coffeemachine.coffeemachine.model;

import java.util.Date;

import javax.persistence.*;

//Order's history
@Entity
public class Orders {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int number;
	
	private Date date;
	
	private String drinkName;
	
	private double size;
	
	private boolean paperCup;
	
	private double sugar;

	
	//constructor
	public Orders(Date date, String drinkName, double size, boolean paperCup, double sugar) {
		super();
		this.date = date;
		this.drinkName = drinkName;
		this.size = size;
		this.paperCup = paperCup;
		this.sugar = sugar;
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

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isPaperCup() {
		return paperCup;
	}

	public void setPaperCup(boolean paperCup) {
		this.paperCup = paperCup;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	
	

}
