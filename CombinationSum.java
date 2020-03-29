import java.util.Scanner; 

public class CombinationSum{

//This code will add two numbers and then subtract the first number from their sum. 

	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
			
				System.out.println("Enter 2 numbers to subtract the first number from the sum: "); 
			
				int num1 = num.nextInt();
				int num2 = num.nextInt();

	CombinationSum theAnswer = new CombinationSum();

	int addTheNum = theAnswer.addTheNum(num1, num2);

	System.out.println("The sum of the two numbers is " + addTheNum);

	int finalAnswer;

//Here we are subtracting the first number from the sum. 

	finalAnswer = addTheNum - num1;

	System.out.println("The final answer after subtracting is " + finalAnswer); 

	}

	public int addTheNum(int firstVal, int secondVal){
		int sumOfNum; 
			
				sumOfNum = firstVal + secondVal; 

		return sumOfNum;
	}

}