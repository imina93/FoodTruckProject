package com.skilldistillery.foodtruck.app;
import java.util.*;
public class FoodTruckApp {

	public static void main(String[] args) {
	// create an empty array to hold 5 cars 
		int foodTruckFleet[] = new int[5]; 
	// create scanner for user input
Scanner kb = new Scanner(System.in);		
	// for each input, a FoodTruck is generated
		
	// if user wants less than 5 options, add a quit feature to continue on
FoodTruck truck1 = new FoodTruck();	
	// create a menu 
		DisplayMenu();
		
		// list all existing food trucks
		// list the average rating of the food trucks
		// list all info on the highest rated food truck
		// quit option
		
	// loop the menu to reset after every option until quit
		

		/*
		 * You will create a separate class with a main method that starts the program.
		 * It will have an array to store up to five FoodTruck objects. The main method
		 * of this class is the only static method in the entire project.
		 * 
		 */

		/*
		 * User Story #1 The user is prompted to input the name, food type, and rating
		 * for up to five food trucks. For each set of input, a FoodTruck object is
		 * created, its fields set to the user's input, and it is added to the array.
		 * The truck id is not input by the user, but instead assigned automatically in
		 * the FoodTruck constructor from a static field that is incremented as each
		 * truck is created.
		 * 
		 * User Story #2 If the user inputs quit for the food truck name, input ends
		 * immediately and the program continues.
		 * 
		 * User Story #3 After input is complete, the user sees a menu from which they
		 * can choose to:
		 * List all existing food trucks. See the average rating of food trucks. Display
		 * the highest-rated food truck. Quit the program. 
		 * 
		 * User Story #4 After choosing
		 * a menu item, the user sees the menu again and can choose another item until
		 * the choose to quit.
		 */
	}

	private static void DisplayMenu() {
System.out.println("---------------------");	
System.out.println("---------------------");	
System.out.println("1.See All Food Trucks");	
System.out.println("2.See Average Rating");	
System.out.println("3.See Highest Rated--");	
System.out.println("4.Quit");	
System.out.println("---------------------");	
System.out.println("---------------------");	
	}
	

}
