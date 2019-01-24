package lab8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userChoice = "yes";
		String userDecision = "yes";
		String userSelection = "yes";
		int studentSelection = 0;
		boolean value = true;

		String[] students = new String[8];
		students[0] = "Amelia";
		students[1] = "Betty";
		students[2] = "Charlie";
		students[3] = "Danielle";
		students[4] = "Eddie";
		students[5] = "Frankie";
		students[6] = "Grace";
		students[7] = "Harry";

		String[] hometowns = new String[8];
		hometowns[0] = "Augusta";
		hometowns[1] = "Boston";
		hometowns[2] = "Charleston";
		hometowns[3] = "Denver";
		hometowns[4] = "Everett";
		hometowns[5] = "Framingham";
		hometowns[6] = "Georgetown";
		hometowns[7] = "Houston";

		String[] favoriteFoods = new String[8];
		favoriteFoods[0] = "Applesauce";
		favoriteFoods[1] = "Burgers";
		favoriteFoods[2] = "Cake";
		favoriteFoods[3] = "Donuts";
		favoriteFoods[4] = "Eggs";
		favoriteFoods[5] = "French fries";
		favoriteFoods[6] = "Grapefruit";
		favoriteFoods[7] = "Hot Dogs";

		System.out.println("Welcome to Old School. Here is a list of our students: ");
		System.out.println("1. Amelia");
		System.out.println("2. Betty");
		System.out.println("3. Charlie");
		System.out.println("4. Danielle");
		System.out.println("5. Eddie");
		System.out.println("6. Franklie");
		System.out.println("7. Grace");
		System.out.println("8. Harry");

		
		do {
			System.out.println("Please enter the number of the student you would like to learn about: ");
			
			do {
				try {
					studentSelection = scnr.nextInt();
					System.out.println("Student " + (studentSelection) + " is " + students[studentSelection - 1] + ".");
				}
				catch (IndexOutOfBoundsException | InputMismatchException | IllegalArgumentException e) 
				{
					System.out.println("Error. Please try again by entering a number beween 1 and 8: ");
					scnr.nextLine();
				}
			
			} while (studentSelection <1 || studentSelection>8 );
			scnr.nextLine();
			
			do {
				
				
				System.out.println("What would you like to know about " + students[studentSelection - 1]
						+ "? (enter \"hometown\" or \"favorite food\")");
				
					
				do {
						userDecision = scnr.nextLine();
					if (userDecision.equalsIgnoreCase("favorite food")) {
						value = true;
						System.out.println(students[studentSelection - 1] + " likes " + favoriteFoods[studentSelection - 1]);
					} else if (userDecision.equalsIgnoreCase("hometown")) {
						value = true;
						System.out.println(
							"" + students[studentSelection - 1] + " is from " + hometowns[studentSelection - 1]);
					} else {
						value = false;
						System.out.println("That data does not exist. Please"
								+ " enter \"hometown\" or \"favorite food\"");
					}
				} while (value == false);	
					
				
				System.out.println(
						"\n" + "Would you like to learn more about " + students[studentSelection - 1] + "? Enter \"yes\" or \"no\": ");

					userChoice = scnr.nextLine();
					
			} while (userChoice.equalsIgnoreCase("yes"));
			
			System.out.println("Would you like to learn more about another student? Enter \"yes\" or \"no\":");
			userSelection = scnr.nextLine();
			
		} while (userSelection.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you for visiting Old School!");
		scnr.close();

	}
}
