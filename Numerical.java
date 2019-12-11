import java.util.Scanner; //Import the scanner class

/*
@author: Srihita 
Find least value
Used instance methods and not static methods - as instance methods is the most used.
*/

public class Numerical {
	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in); // Create a scanner object 
			System.out.println("Input the first number:");

			int firstValue = num1.nextInt();

			System.out.println("Input the second number:");

			int secondValue = num1.nextInt();

			System.out.println("Input the third number:");

			int thirdValue = num1.nextInt(); 


			int a[] ={firstValue, secondValue, thirdValue}; 

			Numerical n = new Numerical();

				int finalLeastValue = n.findLeastValue(a);
				System.out.println("This is the least value: " +finalLeastValue);
	}

	public int findLeastValue(int[] myArray) {
		int leastValue = myArray[0]; //Start with the assumption that the first value in the array is the least value. 

		for(int i=1; i<myArray.length; i++) {

			if (leastValue > myArray[i]) {
				leastValue = myArray[i];
			}
		} 


		return leastValue; 



	}
	
}

