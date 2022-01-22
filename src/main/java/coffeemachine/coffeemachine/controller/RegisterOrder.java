package coffeemachine.coffeemachine.controller;

import coffeemachine.coffeemachine.model.Amounts;
import coffeemachine.coffeemachine.model.Drink;
import coffeemachine.coffeemachine.model.DrinkOrder;
import coffeemachine.coffeemachine.model.PaperCup;

import javax.persistence.EntityManager;
import java.util.Date;

//To register all the orders made completely
public class RegisterOrder {
	
	public void main(EntityManager em, Drink drink, double size, boolean withPaperCup, double sugar, double price, boolean ordered) {
		Date orderDate = new Date();
		em.getTransaction().begin();
		DrinkOrder order = new DrinkOrder(orderDate, drink, size, withPaperCup, sugar, price, ordered);
		em.persist(order);
		em.getTransaction().commit();		
	}
	
	public void updateSugar(EntityManager em, int sugarQtt) {
		em.getTransaction().begin();
		Amounts amounts = em.find(Amounts.class, 1);
		amounts.setSugar(amounts.getSugar() - sugarQtt*0.005);
		em.persist(amounts);
		em.getTransaction().commit();
	}
	
	public void updateWater(EntityManager em, double waterQtt) {
		em.getTransaction().begin();
		Amounts amounts = em.find(Amounts.class, 1);
		amounts.setWater(amounts.getWater() - waterQtt);
		em.persist(amounts);
		em.getTransaction().commit();
	}
	
	public void updateDrink(EntityManager em, int drink_id) {
		em.getTransaction().begin();
		Drink drink = em.find(Drink.class, drink_id);
		drink.setQuantity(drink.getQuantity() - 1);
		em.persist(drink);
		em.getTransaction().commit();
	}
	
	public void updatePaperCup(EntityManager em, double size) {
		em.getTransaction().begin();
		PaperCup paperCup = em.find(PaperCup.class, size);
		paperCup.setQuantity(paperCup.getQuantity()-1);
		em.persist(paperCup);
		em.getTransaction().commit();
	}

}
