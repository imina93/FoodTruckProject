package com.skilldistillery.foodtruck.app;

import java.util.*;

public class FoodTruckApp {

	public static void main(String[] args) {
		// Generate an array to hold up to 5 trucks
		FoodTruck foodTruckFleet[] = new FoodTruck[5];
		

		// Welcome Menu
		System.out.println("Welcome To The Foodie Fleet Rating App!!");
		System.out.println("Enter the name, type, and rating of up to 5 food trucks:");
		System.out.println("If you would like to skip, enter 'QUIT' when prompted for a name.");
		
		for (int i=0;i<5;i++) {
			Scanner kb = new Scanner(System.in);
			String input = kb.next();			
				foodTruckFleet[i] = new FoodTruck(input, input, i);
				System.out.println("Enter Truck Name: ");
				foodTruckFleet[i].setName(kb.next());
				System.out.println("");
				System.out.println("Enter Type of Food: ");
				foodTruckFleet[i].setFoodType(kb.next());
				System.out.println("");
				System.out.println("Enter Truck Rating: ");
				foodTruckFleet[i].setNumRating(kb.nextInt());
				if (input == "Quit") {
					break;	
				}
				kb.close();
		} 
		DisplayMenu();
		boolean isMenu = true;
		int menuSelection = 0;
		while (isMenu) {
			switch (menuSelection) {
			case 1:
				foodTruckFleet.toString();
				break;
			case 2: 
				int sum = 0;
				for (int i = 0; i < foodTruckFleet.length; i++) {
					sum = sum + foodTruckFleet[i].getNumRating();
					double average = sum / foodTruckFleet.length;
					System.out.println("The average rating is: " + average);
				}
			case 3: 
				int max = foodTruckFleet[0].getNumRating();
				for (int i = 0; i < foodTruckFleet.length; i++) {
					if (foodTruckFleet[i].getNumRating() > max) {
						max = foodTruckFleet[i].getNumRating();
					System.out.println(max);
					}
				}
			case 4:
				isMenu = false;
				break;
			}
				System.out.println("Thanks for using the Foodie Fleet App!");
		} 
	
		
			
		
	}


	private static void DisplayMenu() {
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("Choose an option number");
		System.out.println("1.See All Food Trucks");
		System.out.println("2.See Average Rating");
		System.out.println("3.See Highest Rated");
		System.out.println("4.Quit");
		System.out.println("---------------------");
		System.out.println("---------------------");
	}

}
