import java.util.Scanner; 

public class DivideTheNumbers{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 2 numbers to divide"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();

    DivideTheNumbers finalanswer = new DivideTheNumbers();
	
	float dividingTheNumbers = finalanswer.dividingTheNumbers(num1, num2);

	System.out.println("The answer after dividing the numbers is " + dividingTheNumbers); 

	}


	public float dividingTheNumbers(float firstNum, float secondNum){
		
		float theAnswer; 
	
		
			theAnswer = firstNum/secondNum;


		return theAnswer; 
	}


}
