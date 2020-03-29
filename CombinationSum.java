import java.util.Scanner; 

public class CombinationSum{

	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
			
				System.out.println("Enter 2 numbers to subtract the first number from the sum: "); 
			
				int num1 = num.nextInt();
				int num2 = num.nextInt();

	CombinationSum theAnswer = new CombinationSum();

	int addTheNum = theAnswer.addTheNum(num1, num2);

	System.out.println("The sum of the two numbers is " + addTheNum);

	int finalAnswer;

	finalAnswer = addTheNum - num1;

	System.out.println("The final answer after subtracting is " + finalAnswer); 

	}

	public int addTheNum(int firstVal, int secondVal){
		int sumOfNum; 
			
				sumOfNum = firstVal + secondVal; 

		return sumOfNum;
	}

}