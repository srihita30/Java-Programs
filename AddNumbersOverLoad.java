import java.util.Scanner; 


// This is to demonstrate static  polymorphism with the example of adding 5 numbers. 
public class AddNumbersOverLoad{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 5 numbers to find their sum"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();
    int num3 = num.nextInt();
    int num4 = num.nextInt();
    int num5 = num.nextInt();

    int newArray[] = {num1, num2, num3, num4, num5};

    AddNumbersOverLoad finalSum = new AddNumbersOverLoad();
	
	int addingTheNumbers = finalSum.addingTheNumbers(newArray);

	System.out.println("The sum after adding the 5 numbers is " + addingTheNumbers); 

	addingTheNumbers = finalSum.addingTheNumbers(num1, num2, num3, num4, num5); 

	System.out.println("The sum of the 5 numbers is " + addingTheNumbers); 


	}


	public int addingTheNumbers(int[] anArray){
		int sumOfNumbers = 0; 

		for( int i = 0; i<anArray.length; i++){
			sumOfNumbers = sumOfNumbers + anArray[i];
		}

		return sumOfNumbers; 
	}

	public int addingTheNumbers(int number1, int number2, int number3, int number4, int number5){ 

		int finalNum = number1 + number2 + number3 + number4 + number5; 

		return finalNum; 
	}


}
