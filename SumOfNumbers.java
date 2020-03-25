import java.util.Scanner; 

public class SumOfNumbers{

	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
			
				System.out.println("Enter 2 numbers to find their sum"); 
			
				int num1 = num.nextInt();
				int num2 = num.nextInt();

	SumOfNumbers theSum = new SumOfNumbers();

	int addTheNum = theSum.addTheNum(num1, num2);

	System.out.println("The sum of the two numbers is " + addTheNum);

	}

	public int addTheNum(int firstVal, int secondVal){
		int sumOfNum; 
			
				sumOfNum = firstVal + secondVal; 

		return sumOfNum;
	}
}