import java.util.Scanner; 

public class ProductOfNumbers{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 2 numbers to find their product"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();
    
    int newArray[] = {num1, num2};

    ProductOfNumbers finalProduct = new ProductOfNumbers();
	
	int multiplyingTheNumbers = finalProduct.multiplyingTheNumbers(newArray);

	System.out.println("The product after multipyling the 2 numbers is " + multiplyingTheNumbers); 

	}


	public int multiplyingTheNumbers(int[] anArray){
		int productOfNumbers = 1; 

		for( int i = 0; i<anArray.length; i++){
			productOfNumbers = productOfNumbers * anArray[i];
		}

		return productOfNumbers; 
	}

}