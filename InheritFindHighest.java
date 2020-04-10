import java.util.Scanner;

public class InheritFindHighest extends FindMax{

// By using oops this code will find the highest value of an odd numbers array. 

	public static void main(String[] args){

			Scanner num = new Scanner(System.in); 

			System.out.println("Enter the total number of numbers which you want to find the highest value for: ");

			int lengthNum = num.nextInt(); 

			// This array will store the values one by one after satisfying the "if" condition in the while loop. 

			int[] theArray = new int[lengthNum];

			int i = 0;

			while (i < theArray.length){

				System.out.println("Enter the value: ");

				// "num1" is for storing the user entered values. 

				int num1 = num.nextInt(); 

				// array will keep taking values until it contains odd values only. 

					if(num1 % 2 != 0){

	  				theArray[i] = num1; 

	  				i = i + 1; 
	  				
	  				}
			}

		InheritFindHighest theHighest = new InheritFindHighest();

		int MaxValue = theHighest.MaxValue(theArray); 

		System.out.println("The highest of the numbers is " + MaxValue); 

	}

}



