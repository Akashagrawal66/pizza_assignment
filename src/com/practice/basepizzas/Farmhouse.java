package com.practice.basepizzas;

import com.practice.Pizza;

public class Farmhouse implements Pizza{

	@Override
	public int getCost() {
		
		return 150;
	}

	@Override
	public String getDescription() {
		return "Farmhouse";
	}

}
