package main.java.coffeemachine.coffeemachine.view;

import javax.persistence.*;
import main.java.coffeemachine.coffeemachine.controller.*;

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
