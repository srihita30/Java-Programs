import java.util.Scanner; 

/*
This code will be used to calculate the average of all the integers given by the user. Here, the number of entries (of integers) is specified by the user herself. 
*/


public class AverageUserEnteredNumbers{
	
	public static void main(String[] args){
				
			AverageUserEnteredNumbers theAvg = new AverageUserEnteredNumbers();

			int[] inputArray = theAvg.takeInput(); 

			int avgUserNum = theAvg.avgUserNum(inputArray);

			System.out.println("The average of the numbers is " + avgUserNum);

	}

	public int[] takeInput() {

		Scanner num = new Scanner(System.in);

				System.out.println("Enter the number of values for which you want to find the average for :"); 
					
					// "num1" is the number of integers to be entered by the user. 
					
					int num1 = num.nextInt();

					// This array will be used to store all of the values to be entered by the user. 

					int[] allTheValues = new int[num1];

				for(int n=0; n<allTheValues.length; n++){

					System.out.println("Enter the " + n + " value: ");

					int val = num.nextInt();

					allTheValues[n] = val ;

				}

			return allTheValues; 
	}

	/*
		This method "avgUserNum" will be used to calculate the avg of the numbers in an array. 
	*/

	public int avgUserNum(int[] theArray){
		int counterVal = 0;
			int sumVal = 0;
			int averageVal = 0; 

			for (int i=0; i<theArray.length; i++) {

				sumVal = sumVal + theArray[i]; 
				counterVal = counterVal + 1; 
			}
				averageVal = sumVal/counterVal;

				return averageVal;
	} 

}