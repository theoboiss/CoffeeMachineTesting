package coffeemachine.coffeemachine.view;

import javax.persistence.EntityManager;

public class DrinksView {

	//attributes
	private EntityManager em;

	
	//constructor
	public DrinksView(EntityManager em) {
		super();
		this.em = em;
	}

	
	//getters and setters
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	//other methods
	
	
	
}
