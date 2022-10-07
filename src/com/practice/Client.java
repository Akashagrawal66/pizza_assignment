package com.practice;

import com.practice.basepizzas.BBQChicken;
import com.practice.toppings.Cheese;
import com.practice.toppings.Paneer;
import com.practice.toppings.Tomato;

public class Client {
	public static void main(String[] args) {
		Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
		System.out.println(pizza.getCost()); 
		System.out.println(pizza.getDescription());

	}
}
