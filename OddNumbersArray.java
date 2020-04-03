import java.util.Scanner; 

// From the main method this code will print the odd values in an array. 

public class OddNumbersArray{

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

			System.out.println("Enter any 5 Values:");

			int num1 = num.nextInt();
			int num2 = num.nextInt();
			int num3 = num.nextInt();
			int num4 = num.nextInt();
			int num5 = num.nextInt();
			

			int anArray[] = {num1, num2, num3, num4, num5};

			OddNumbersArray arrayVal = new OddNumbersArray(); 
			
			int[] oddVal = arrayVal.findTheOddVal(anArray);

			// looping through the index values of the array will help print the list of the odd values. 
			
			for(int m = 0; m < oddVal.length; m++){

			System.out.println("Main: The Odd Values Of the Array are : " + oddVal[m]);


		}
	}

	public int[] findTheOddVal(int[] theArray){

		int[] oddValues = new int[theArray.length];

		int n = 0; //"n" is the counter value of the array "oddValues". 

		for(int i = 0; i < theArray.length; i++){
		
			if (theArray[i] % 2 != 0) { 

					oddValues[n] = theArray[i];	

				// Debug Comment #1 : System.out.println("findTheOddVal: The Odd Values Of the Array are : " + oddValues[n] + " / " + n );

					
					n = n+1; // "n" value increases and thus the counter moves to the next index value in the array to store the value.
			
			} 
		} 
		
				//Debug Comment #2 : System.out.println("findTheOddVal: Outside for loop. Length : " + oddValues.length);

		
		return oddValues;

	}

}