package com.practice.toppings;

import com.practice.Pizza;

public class Olive implements Pizza {
	private Pizza pizzaBaseAndToppings;
	
	public Olive(Pizza pizzaBaseAndToppings) {
		this.pizzaBaseAndToppings = pizzaBaseAndToppings;
	}

	@Override
	public int getCost() {
		return pizzaBaseAndToppings.getCost() + 20;
	}

	@Override
	public String getDescription() {
		return pizzaBaseAndToppings.getDescription() + " + Olive";
	}

}
