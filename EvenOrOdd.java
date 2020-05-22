import java.util.Scanner; 

public class EvenOrOdd{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter a numbers to add and decide if even or odd: "); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();

    EvenOrOdd finalanswer = new EvenOrOdd();
	
	String evenOrOddNumber = finalanswer.evenOrOddNumber(num1, num2);

	System.out.println("The number you entered is an " + evenOrOddNumber + " number"); 

	}


	public String evenOrOddNumber(int firstNum, int secondNum){
		
		String theAnswer = " ";

		int theSum = 0; 

		theSum = firstNum + secondNum; 
	
		if (theSum/2 == 0){

			theAnswer = "even";
		}

		else {
			theAnswer = "odd";
		}

		System.out.println("The sum of the numbers is: " + theSum);

		return theAnswer; 
	}


}

