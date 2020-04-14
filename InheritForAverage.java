import java.util.Scanner; 

//This class will instantiate the "AverageUserEnteredNumbers" class to use its fucntionality and print the average. 


public class InheritForAverage {

	public static void main(String[] args){

		AverageUserEnteredNumbers calculateTheAvg = new AverageUserEnteredNumbers(); 

		int[] takeInput = calculateTheAvg.takeInput(); 

		int avgUserNum = calculateTheAvg.avgUserNum(takeInput);

		System.out.println("The sum of all the 5 numbers entered is " + avgUserNum);

	}

}