package coffeemachine.coffeemachine.controller;

import coffeemachine.coffeemachine.model.*;

import javax.persistence.EntityManager;

//Insert initial values in the database
public class DB {
	
	public void insertAll(EntityManager em) {
		insertDrinks(em);
		insertPaperCups(em);
		insertAmounts(em);
	}

	
	public void insertDrinks(EntityManager em) {
		Drink coffee = new Drink("coffee", "Real black coffee", 1.20, 100);
		Drink orange_juice = new Drink("orange juice", "With organic oranges", 1.50, 70);
		Drink tea = new Drink("tea", "Flavor strawberry", 1.20, 100);
	      
	    em.getTransaction().begin();
	    em.persist(coffee);
	    em.persist(orange_juice);
	    em.persist(tea);
	    em.getTransaction().commit();
	}
	
	
	public void insertPaperCups(EntityManager em) {
		PaperCup small = new PaperCup(0.35, 0.10, 500);
		PaperCup big = new PaperCup(0.75, 0.15, 350);
		
		em.getTransaction().begin();
		em.persist(small);
		em.persist(big);
		em.getTransaction().commit();
	}
	
	
	public void insertAmounts(EntityManager em) {
		Amounts amout = new Amounts(1, 100, 5);
		
		em.getTransaction().begin();
		em.persist(amout);
		em.getTransaction().commit();
	}
	
}
