package coffeemachine.coffeemachine.view;

import coffeemachine.coffeemachine.controller.*;
import coffeemachine.coffeemachine.model.Drink;
import coffeemachine.coffeemachine.model.PaperCup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainView {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_file");
		emf.createEntityManager();
		
		//To insert data in the DB
		//DB controllerDB = new DB();
		//controllerDB.insertAll(em);
		
		OrderDrink orderDrink = new OrderDrink();
		CheckQuantities checkQtt = new CheckQuantities();
		RegisterOrder registerOrder = new RegisterOrder();
		Scanner sc = new Scanner(System.in);
		int sugarDosesMax = 5;
		String state = "on";
	
		
		while(state.equals("on")) {
			
			//Initialization
			double price = 0.00;
			boolean paperCupSelected = false;
			boolean confirmOrder = false;
			
			
			//No stock
			if(!checkQtt.checkQuantitiesRequiredToOrder()) {
				System.out.println("No stock available");
				break;
			}
			
			
			//Display drinks available
			List<Drink> drinksAvailable = orderDrink.getDrinks();
			for(int i = 0; i < drinksAvailable.size(); i++) {
				System.out.println(drinksAvailable.get(i).getNumber() + 
						" | " + drinksAvailable.get(i).getName() + 
						" | Descrition : " + drinksAvailable.get(i).getDescription() + 
						" | Price : " + drinksAvailable.get(i).getPrice());
			}
			
			
			//choose drink
			System.out.println("Enter a drink number : ");
			Drink drink = orderDrink.chooseDrink(sc, drinksAvailable);
			price += drink.getPrice();
			
			
			//choose paper cup
			System.out.println("Do you need a paper cup ? (y/n)");
			String takePaperCup = sc.next();
			List<PaperCup> paperCups = new ArrayList<PaperCup>();
			if(takePaperCup.equals("y")) {
				paperCupSelected = true;
				paperCups = orderDrink.getPaperCupAvailable();
				if(paperCups.isEmpty()) {
					System.out.println("Sorry paper cup is out of stock");
					continue;
				}
				for(int i = 0; i < paperCups.size(); i++) {
					System.out.println("Size : " +  paperCups.get(i).getSize() +
							" | Price : " + paperCups.get(i).getPrice());
				}
			} else {
				takePaperCup = "n";
				paperCups = orderDrink.getSizes();
				for(int i = 0; i < paperCups.size(); i++) {
					System.out.println("Size : " +  paperCups.get(i).getSize());
				}
			}

			
			//choose size
			System.out.println("Select a size");
			PaperCup paperCup = orderDrink.chooseSize(sc, paperCups);
			if(paperCupSelected) {
				price += paperCup.getPrice();
			}
			
		
			//choose sugar
			int sugarDoseAvailable = orderDrink.getSugarDoses(sugarDosesMax);
			System.out.println("How many sugar do you want ?\n" + 
					"select from 0 to " + sugarDoseAvailable );
			int sugarDoseSelected = orderDrink.chooseSugar(sc);
		
			
			//complete order recap
			System.out.println("You ordered : \n" + drink.getName() +
					"\nSize : " + paperCup.getSize() + "\nPaperCup : " + takePaperCup +
					"\nSugar : " + sugarDoseSelected + "\nPrice : " + price);
		
			
			//confirm order
			System.out.println("Confirm ? (y/n)");
			String ordered = sc.next();
			if(ordered.equals("y")) {
				confirmOrder = true;
				//update quantities
				registerOrder.updateDrink(drink.getNumber());
				registerOrder.updateSugar(sugarDoseSelected);
				registerOrder.updateWater(paperCup.getSize());
				if (paperCupSelected) {
					registerOrder.updatePaperCup(paperCup.getSize());
				}
			}
			
	
			//register order
			registerOrder.main(drink, paperCup.getSize(), paperCupSelected, sugarDoseSelected, price, confirmOrder);
			

		}		
			
				
	}

}
