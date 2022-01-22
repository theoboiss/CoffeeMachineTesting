package coffeemachine.coffeemachine.controller;

import coffeemachine.coffeemachine.model.*;

import javax.persistence.EntityManager;

//Insert initial values in the database
public class DB {

	public static EntityManager em;

	
	public void insertAll(EntityManager em) {
		insertDrinks(em);
		insertPaperCups(em);
		insertAmounts(em);
	}

	
	public void insertDrinks(EntityManager em) {
		Drink coffee = new Drink("coffee", "Real black coffee", 1.20, 100, null);
		Drink orange_juice = new Drink("orange juice", "With organic oranges", 1.50, 70, null);
		Drink tea = new Drink("tea", "Flavor strawberry", 1.20, 100, null);
	      
	    em.getTransaction().begin();
	    em.persist(coffee);
	    em.persist(orange_juice);
	    em.persist(tea);
	    em.getTransaction().commit();
	}
	
	
	public void insertPaperCups(EntityManager em) {
		PaperCup small = new PaperCup(0.35, 0.10, 500, null);
		PaperCup big = new PaperCup(0.75, 0.15, 350, null);
		
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


	public static EntityManager getEm() {
		return em;
	}

	public static void setEm(EntityManager em) {
		DB.em = em;
	}

}
