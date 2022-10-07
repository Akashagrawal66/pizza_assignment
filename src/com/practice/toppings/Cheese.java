package com.practice.toppings;

import com.practice.Pizza;

public class Cheese implements Pizza {
	private Pizza pizzaBaseAndToppings;
	
	public Cheese(Pizza pizzaBaseAndToppings) {
		this.pizzaBaseAndToppings = pizzaBaseAndToppings;
	}

	@Override
	public int getCost() {
		return pizzaBaseAndToppings.getCost() + 80;
	}

	@Override
	public String getDescription() {
		return pizzaBaseAndToppings.getDescription() + " + Cheese";
	}

}
