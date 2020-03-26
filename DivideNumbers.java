import java.util.Scanner; 

public class DivideNumbers{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 2 numbers to divide"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();

    DivideNumbers finalanswer = new DivideNumbers();
	
	int dividingTheNumbers = finalanswer.dividingTheNumbers(num1, num2);

	System.out.println("The answer after dividing the numbers is " + dividingTheNumbers); 

	}


	public int dividingTheNumbers(int firstNum, int secondNum){
		
		int theAnswer; 
	
		if (firstNum>secondNum){
			theAnswer = firstNum/secondNum;
		}

		else {
			theAnswer = secondNum/firstNum;
		}

		return theAnswer; 
	}


}
