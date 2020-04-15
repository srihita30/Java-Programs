import java.util.Scanner;

// This class will reverse the string entered. 

public class ReverseString {
	public static void main(String[] arga){

		Scanner stringObj = new Scanner(System.in);
		System.out.println("Please enter your string here: "); 

		String userInput = stringObj.nextLine();

		ReverseString reversedAnswer = new ReverseString();

		String userString = reversedAnswer.methodToReverse(userInput); 

		System.out.println("The reversed string is: " + userString); 

	}

	// This method will reverse the string and return it. 

	public String methodToReverse(String myString){

		int lengthOfString = myString.length();

		String reversed = " "; 

		for(int i = lengthOfString - 1; i>=0; i--){

			// The "if" condition below will ensure that none of the spaces and "p"s entered by the user will be printed after being reversed. 

			if  ( (myString.charAt(i) != ' ') && (myString.charAt(i) != 'p') && (myString.charAt(i) != 'P')){

			reversed = reversed + myString.charAt(i);

			}

		}

			return reversed; 
	}
}