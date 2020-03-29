import java.util.Scanner; 

//This code will add two numbers and then subtract the first number from their sum, using inheritance. 

public class InheritToCalculate extends SumOfNumbers{
	
	public static void main (String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any 2 numbers to calculate: ");

		int num1 = obj.nextInt();

		int num2 = obj.nextInt();

		InheritToCalculate theSum = new InheritToCalculate();

		int addTheNum = theSum.addTheNum(num1, num2);
		
		System.out.println("The sum of the 2 numbers entered is " + addTheNum);

		int theAnswer; 

		theAnswer = addTheNum - num1;

		System.out.println("The final answer after subtracting is " + theAnswer); 

	}

	
}