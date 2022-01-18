package main.java.coffeemachine.coffeemachine.controller;

import java.util.List;

import javax.persistence.*;

//Main function to order a drink, use CheckQuantities
public class OrderDrink {
	
	public void showDrinks(EntityManager em) {
		Query query = em.createQuery("SELECT drink.number, drink.name, drink.description, drink.price FROM Drink drink");
		List drinks = query.getResultList();
		for(int i = 0; i < drinks.size(); i++) {
			Object [] drink = (Object[])drinks.get(i);
			int number = (int)drink[0];
			String name = (String)drink[1];
			String description = (String)drink[2];
			double price = (double)drink[3];
			System.out.println(number + " | " + name + " | Descrition : " + description + " | Price : " + price);
		}
	}

}
