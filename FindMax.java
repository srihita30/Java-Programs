import java.util.Scanner;

public class FindMax{

// This code is aimed at finding the highest value of an odd numbers array. 

	public static void main(String[] args){

			Scanner num = new Scanner(System.in); 

			System.out.println("Enter the total number of numbers which you want to find the highest value for: ");

			int lengthNum = num.nextInt(); 

			// This array will store the values one by one after satisfying the "if" condition in the while loop. 

			int[] theArray = new int[lengthNum];

			//System.out.println("Debug 1: array length: "+ lengthNum +" / "+theArray.length);

			int i = 0;

			while (i < theArray.length){

				System.out.println("Enter the value: ");

				// "num1" is for storing the user entered values. 

				int num1 = num.nextInt(); 

				// array will keep taking values until it contains odd values only. 

					if(num1 % 2 != 0){

	  				theArray[i] = num1; 

	  				i = i + 1; 
	  				//System.out.println("Debug 2: FindMax: Inside main: while array build: if: " +i+ "/"+num1) ;

	  				}
	  				//System.out.println("Debug 3: FindMax: Inside main: while array build: outside if: " +i+ "/"+num1) ;
			}

		//System.out.println("Debug 4: FindMax: Inside main: outside while loop: " +i) ;

		FindMax theHighest = new FindMax();

		int MaxValue = theHighest.MaxValue(theArray); 

		System.out.println("The highest of the numbers is " + MaxValue); 

	}

		// This method "MaxValue", is the logic for finding the highest value in the array. 

		public int MaxValue(int[] anArray){

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
