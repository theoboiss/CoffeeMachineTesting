package coffeemachine.coffeemachine.view;

import coffeemachine.coffeemachine.controller.OrderDrink;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainView {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_file");
		EntityManager em = emf.createEntityManager();
		
		//DB controllerDB = new DB();
		//controllerDB.insertAll(em);
		
		OrderDrink orderDrink = new OrderDrink();
		orderDrink.showDrinks(em);
	}

}
