import java.util.Scanner;

public class SumCalculator{
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in); 

		System.out.println("How many numbers sum do you want to print? "); 
		int countOfNumbers = obj.nextInt(); 

		System.out.println("Enter all of the " + countOfNumbers + " numbers you want to print: "); 
		int userInputValues[] = new int[countOfNumbers]; 

		for(int i=0; i<userInputValues.length; i++) {
			userInputValues[i] = obj.nextInt(); 
		}

		SumCalculator sumFinder = new SumCalculator();
		int getTheSum = sumFinder.getTheSum(userInputValues);
		System.out.println("The sum of all the values entered is = " + getTheSum);
	}
		public int getTheSum(int[] listOfValues){
			int sumTotal = 0; 

			for(int n=0; n<listOfValues.length; n++){
				sumTotal = sumTotal + listOfValues[n];
			}

			return sumTotal;
	}
}
