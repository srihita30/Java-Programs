import java.util.Scanner;

public class FactorialVal{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the value you want to find the Factorial for: ");
		int nVal = obj.nextInt(); 

		FactorialVal x = new FactorialVal(); 
		int getFactorial = x.getFactorial(nVal);

		System.out.println("The factorial value of the entered number is = " +getFactorial);
	}

	public int getFactorial(int myVal) {
		int finalVal = 1; 

		for(int i=1; i <= myVal; i++){
			finalVal = finalVal * i; 
		}

		return finalVal;
	}
}