package coffeemachine.coffeemachine.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

import coffeemachine.coffeemachine.model.Drink;
import coffeemachine.coffeemachine.model.PaperCup;

//Main function to order a drink, use CheckQuantities
public class OrderDrink {

	public List<Drink> getDrinks(EntityManager em) {
		Query query = em.createQuery("from Drink d where d.quantity > 0");
		List<Drink> drinksAvailable = query.getResultList();
		return drinksAvailable;
	}

	public Drink chooseDrink(Scanner sc, List<Drink> drinksAvailable) {
		int drinkNumber = sc.nextInt();
		Drink drink = null;
		for(int i = 0; i < drinksAvailable.size(); i++) {
			if(drinksAvailable.get(i).getNumber() == drinkNumber) {
				drink = drinksAvailable.get(i);
			}
		}
		while (drink == null) {
			System.out.println("Please enter a valid value : ");
			drinkNumber = sc.nextInt();
			for(int i = 0; i < drinksAvailable.size(); i++) {
				if(drinksAvailable.get(i).getNumber() == drinkNumber) {
					drink = drinksAvailable.get(i);
				}
			}
		}
		return drink;
	}

	public List<PaperCup> getSizes(EntityManager em) {
		CheckQuantities checkQtt = new CheckQuantities();
		Query query = em.createQuery("from PaperCup");
		List<PaperCup> paperCups = query.getResultList();
		List<PaperCup> sizesAvailable = new ArrayList<PaperCup>();
		for(int i = 0; i < paperCups.size(); i++) {
			if(checkQtt.checkWaterQuantities(em, paperCups.get(i).getSize())) {
				sizesAvailable.add(paperCups.get(i));
			}
		}
		return sizesAvailable;
	}

	public List<PaperCup> getPaperCupAvailable(EntityManager em) {
		CheckQuantities checkQtt = new CheckQuantities();
		List<PaperCup> sizesAvailable = this.getSizes(em);
		List<PaperCup> paperCupsAvailable = new ArrayList<PaperCup>();
		for(int i = 0; i < sizesAvailable.size(); i++) {
			if(checkQtt.checkPaperCupQuantities(em, sizesAvailable.get(i).getSize())) {
				paperCupsAvailable.add(sizesAvailable.get(i));
			}
		}
		return paperCupsAvailable;
	}

	public PaperCup chooseSize(Scanner sc, List<PaperCup> sizesAvailable) {
		double size = sc.nextDouble();
		PaperCup paperCup = null;
		while (paperCup == null) {
			for(int i = 0; i < sizesAvailable.size(); i++) {
				if(sizesAvailable.get(i).getSize() == size) {
					paperCup = sizesAvailable.get(i);
				}
			}
		}
		return paperCup;
	}

	public int getSugarDoses(EntityManager em, int sugarDoseMax) {
		CheckQuantities checkQtt = new CheckQuantities();
		for(int i = sugarDoseMax; i > 0; i--) {
			if(checkQtt.checkSugarQuantities(em, i)) {
				return i;
			}
		}
		return 0;
	}

	public int chooseSugar(EntityManager em, Scanner sc) {
		int sugarQtt = sc.nextInt();
		while ( 5 < sugarQtt || sugarQtt < 0 ) {
			System.out.println("Please enter a valid value : ");
			sugarQtt = sc.nextInt();
		}
		return sugarQtt;

	}

}
