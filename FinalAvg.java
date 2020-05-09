import java.util.Scanner;

public class FinalAvg{
	public static void main(String args[]) {

	Scanner num = new Scanner(System.in);

	System.out.println("Input the first number: ");

	int firstVal = num.nextInt();

	System.out.println("Input the second number: ");

	int secondVal = num.nextInt();

	System.out.println("Input the second number: "); 

	int thirdVal = num.nextInt();

	int anArray[] = {firstVal, secondVal, thirdVal}; 

	FinalAvg x = new FinalAvg();
	int theFinalAvg = x.theFinalAvg(anArray); 
	System.out.println("The average value of the sum and the product of the entered numbers is: " + theFinalAvg);

	}

	public int theFinalAvg(int[] myArray) {

		int sumVal = 0;
		int productVal = 1;
		int avgVal = 0;

		for(int i=0; i<myArray.length; i++){
			sumVal = sumVal + myArray[i];
		}
		for(int i=0; i<myArray.length; i++){
			productVal = productVal * myArray[i];  
		}

		avgVal = (sumVal+productVal)/2;

		return avgVal;
	}

}
