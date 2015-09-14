package quiz;

import java.util.Scanner;

public class football {

	public static void main(String[] args) {

		//initializes the scanner
		Scanner input = new Scanner(System.in);
		// created the TD question for the user
		System.out.println("Number of touch down?");
		double TD = input.nextInt();
		// creates the yards question for the user
		System.out.println("Total yards?");
		double Yards = input.nextInt();
		//creates the interceptions question for the user
		System.out.println("Interceptions?");
		double INT = input.nextInt();
		// creates the completion question for the user
		System.out.println("Completions");
		double comp = input.nextInt();
		// creates the attempted passes for the user
		System.out.println("Number of passes attempted");
		double ATT = input.nextInt();
		
		// the four different equations needed to get the pass rating
		double A = (comp / ATT - .3) * 5;
		double B = (Yards / ATT - 3) * .25;
		double C = (TD / ATT) * 20;
		double D = 2.375 - (INT / ATT) * 25;
		// the four equations used to create the pass rating 
		double PassRating = ((A + B + C + D) / 6) * 100;
		
		// displays the users pass rating from the given information
		System.out.println("The Pass Rating for you is " + PassRating);
		
		input.close();

	}
}
