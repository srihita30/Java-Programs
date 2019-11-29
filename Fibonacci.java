import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);  

		System.out.println("Please enter the number of values for which you want to print the Fibonnacci numbers for: ");

		int numval = obj.nextInt(); 

			System.out.println(" The " + numval + " Fibonacci numbers are :");

		Fibonacci myCount = new Fibonacci();
		myCount.theCount(numval);
	}

	public void theCount(int theFibonacciCounter) {

		int x = 0;
		int y = 1;

		System.out.println(" " + x);
		System.out.println(" " + y);


		for(int i = 0; i<theFibonacciCounter ; i++) 
		{
			
			int sum = x + y;
			x = y;
			y = sum;

			System.out.println(" " + sum);
		}
	}
}