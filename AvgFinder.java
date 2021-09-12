// This program will find the average for a set of numbers that the user decides. 

import java.util.Scanner; 
import java.util.Arrays;

public class AvgFinder
{
	public static void main(String[] args)
	{
		// The prompt below'll be used for the size of the array and the denominator of the fraction to find the avg. 
		System.out.println("For how many number do you want to find the average for?"); 
		Scanner userVals = new Scanner(System.in); // We create a scanner object to take in the user input. 
		int userChosenNumber = userVals.nextInt(); // We assign this object to a variable name to allow its use elsewhere. 
		int userValues[] = new int[userChosenNumber]; // This will specifiy the size of the array for the user entered values.

		// This prompt is to ask the user to enter the values to calculate the avg. 
		System.out.println("Now enter the values you want to find an average for: "); 

		// The for loop below is used to add the user entered values into the array.
		for(int counter = 0; counter < userValues.length; counter++)  
		{
		int userEnteredNum = userVals.nextInt(); // We assign this object a variable name to use it elsewhere. 
		userValues[counter] = userEnteredNum;
		}

		// This print statement will print the user entered values. 
		System.out.println("These are your values: " + Arrays.toString(userValues)); 

		// Now, let's find the average! 

		double sum = 0.0; 
		for(int counterVal = 0; counterVal < userValues.length; counterVal++)
		{
			sum = sum + userValues[counterVal];
		}

		System.out.println("The sum of the values is " + sum);

		double avg = sum/userChosenNumber; // Sum divided by the number of values gives us the average! 

		System.out.println("The average is " + avg);

	} 
}