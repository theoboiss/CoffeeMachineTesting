package coffeemachine.coffeemachine.controller;

import coffeemachine.coffeemachine.model.Amounts;
import coffeemachine.coffeemachine.model.Drink;
import coffeemachine.coffeemachine.model.DrinkOrder;
import coffeemachine.coffeemachine.model.PaperCup;

import javax.persistence.EntityManager;
import java.util.Date;

//To register all the orders made completely
public class RegisterOrder {
	
	public void main(Drink drink, double size, boolean withPaperCup, double sugar, double price, boolean ordered) {
		Date orderDate = new Date();
		DB.em.getTransaction().begin();
		DrinkOrder order = new DrinkOrder(orderDate, drink, size, withPaperCup, sugar, price, ordered);
		DB.em.persist(order);
		DB.em.getTransaction().commit();
	}
	
	public void updateSugar(int sugarQtt) {
		DB.em.getTransaction().begin();
		Amounts amounts = DB.em.find(Amounts.class, 1);
		amounts.setSugar(amounts.getSugar() - sugarQtt*0.005);
		DB.em.persist(amounts);
		DB.em.getTransaction().commit();
	}
	
	public void updateWater(double waterQtt) {
		DB.em.getTransaction().begin();
		Amounts amounts = DB.em.find(Amounts.class, 1);
		amounts.setWater(amounts.getWater() - waterQtt);
		DB.em.persist(amounts);
		DB.em.getTransaction().commit();
	}
	
	public void updateDrink(int drink_id) {
		DB.em.getTransaction().begin();
		Drink drink = DB.em.find(Drink.class, drink_id);
		drink.setQuantity(drink.getQuantity() - 1);
		DB.em.persist(drink);
		DB.em.getTransaction().commit();
	}
	
	public void updatePaperCup(double size) {
		DB.em.getTransaction().begin();
		PaperCup paperCup = DB.em.find(PaperCup.class, size);
		paperCup.setQuantity(paperCup.getQuantity()-1);
		DB.em.persist(paperCup);
		DB.em.getTransaction().commit();
	}

}
