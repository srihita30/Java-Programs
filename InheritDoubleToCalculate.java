import java.util.Scanner; 

//This code will add two numbers and then subtract the first number from their sum, by inheriting two classes : SumOfNumbers and DiffNumbers. 

public class InheritDoubleToCalculate extends SumOfNumbers{
	
	public static void main (String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any 2 numbers to calculate: ");

		int num1 = obj.nextInt();

		int num2 = obj.nextInt();

		InheritDoubleToCalculate theSum = new InheritDoubleToCalculate();

//Inheriting and using SumOfNumbers and its functionality. 

		int addTheNum = theSum.addTheNum(num1, num2);
		
		System.out.println("The sum of the 2 numbers entered is " + addTheNum);

		//Inheriting and using DiffNumbers and its functionality. 

		DiffNumbers finalAnswer = new DiffNumbers();

		int subtractNumbers = finalAnswer.subtractNumbers(addTheNum, num1);

		System.out.println("The final answer after subtracting is " + subtractNumbers); 

	}

	
}