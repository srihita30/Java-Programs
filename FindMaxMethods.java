import java.util.Scanner;

public class FindMaxMethods{

// This code is aimed at finding the highest value od an odd numbers array. 

	public static void main(String[] args){

		FindMaxMethods theHighestValObj = new FindMaxMethods();

		int[] inputArray = theHighestValObj.takeUserInput();

		int maxValue = theHighestValObj.maxValue(inputArray); 

		System.out.println("The highest of the numbers is " + maxValue); 

	}

		// This method "MaxValue", is the logic for finding the highest value in the array. 


			public int[] takeUserInput(){

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

				return theArray; 
			}

		public int maxValue(int[] anArray){

			int i = 0; 

			int max = anArray[i]; 

				while(i<anArray.length) 

				{

					//i = i + 1; 

					if(max < anArray[i]){
						max = anArray [i]; 
					}

					i = i + 1; 

					//System.out.println(" Debug 5: in while loop: The max value is: " + max); 

				}


			return max; 
				
		}

}
