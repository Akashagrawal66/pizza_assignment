package com.practice.toppings;

import com.practice.Pizza;

public class Paneer implements Pizza {
	private Pizza pizzaBaseAndToppings;
	
	public Paneer(Pizza pizzaBaseAndToppings) {
		this.pizzaBaseAndToppings = pizzaBaseAndToppings;
	}

	@Override
	public int getCost() {
		return pizzaBaseAndToppings.getCost() + 60;
	}

	@Override
	public String getDescription() {
		return pizzaBaseAndToppings.getDescription() + " + Paneer";
	}

}
