package com.practice.toppings;

import com.practice.Pizza;

public class Tomato implements Pizza {
	private Pizza pizzaBaseAndToppings;
	
	public Tomato(Pizza pizzaBaseAndToppings) {
		this.pizzaBaseAndToppings = pizzaBaseAndToppings;
	}

	@Override
	public int getCost() {
		return pizzaBaseAndToppings.getCost() + 30;
	}

	@Override
	public String getDescription() {
		return pizzaBaseAndToppings.getDescription() + " + Tomato";
	}

}
