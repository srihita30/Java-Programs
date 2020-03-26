import java.util.Scanner; 

public class ProductOfTheNumbers{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
			
				System.out.println("Enter 2 numbers to find their product"); 
			
				int num1 = num.nextInt();
				int num2 = num.nextInt();

	ProductOfTheNumbers theProduct = new ProductOfTheNumbers();

	int multiplyTheNum = theProduct.multiplyTheNum(num1, num2);

	System.out.println("The product of the two numbers is " + multiplyTheNum);

	}

	public int multiplyTheNum(int firstVal, int secondVal){
		int productOfNum = 0;
		
				productOfNum = firstVal * secondVal;

			return productOfNum;
	}
}