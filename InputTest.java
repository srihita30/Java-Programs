import java.util.Scanner; //Import the scanner class

public class InputTest {
	public static void main(String[] args) {
		
		//System.in;

		Scanner num = new Scanner(System.in); // Create a scanner object 
			System.out.println("Enter any three numbers");

			int firstValue = num.nextInt();
				System.out.println("The first value you entered is = " +firstValue);

			int secondValue = num.nextInt();
				System.out.println("The second value you entered is = " +secondValue);

			int thirdValue = num.nextInt(); 
				System.out.println("The third value you entered is = " +thirdValue);


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