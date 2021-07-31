package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private static int numOfTrucks = 0;
	private int id;
	private String name;
	private String foodType;
	private int numRating;
	/*
	 * You will define a FoodTruck class with fields for a unique numeric id, a name
	 * ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel",
	 * etc.), and a numeric rating.
	 */
	public FoodTruck (String name, String foodType, int numRating) {
		this.name = name;
		this.foodType = foodType;
		this.numRating = numRating;
		numOfTrucks++;
		this.id = numOfTrucks;
	}

	
	
}

