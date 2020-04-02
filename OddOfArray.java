import java.util.Scanner; 

public class OddOfArray{

// This code will print the odd numbers in an array of 5 numbers. 

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

			System.out.println("Enter any 5 Values:");

			int num1 = num.nextInt();
			int num2 = num.nextInt();
			int num3 = num.nextInt();
			int num4 = num.nextInt();
			int num5 = num.nextInt();
			

			int theArray[] = {num1, num2, num3, num4, num5};

			OddOfArray arrayVal = new OddOfArray(); 
			
			arrayVal.findTheOdd(theArray);
	}

// Using the following method, we will print the odd values in an array. 

	public void findTheOdd(int[] anArray){

		int oddValues = 0;

		for(int i = 0; i < anArray.length; i++){

			if (anArray[i] % 2 != 0) { 
				
				oddValues = anArray[i];

				System.out.println("The odd value Of the Array in the index position " + i + " is : " + oddValues);

			} 
		} 

	}

}