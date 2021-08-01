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
	public static int getNumOfTrucks() {
		return numOfTrucks;
	}
	public static void setNumOfTrucks(int numOfTrucks) {
		FoodTruck.numOfTrucks = numOfTrucks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getNumRating() {
		return numRating;
	}
	public void setNumRating(int numRating) {
		this.numRating = numRating;
	}

	
	
}

