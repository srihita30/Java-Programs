import java.util.Scanner; 

public class LengthPrinter{

//This class will be used to print the length of a string. 

	public static void main(String[] args) {
		Scanner objString = new Scanner(System.in); 
		
		System.out.println("Please enter your string here: "); 

		String userInput = objString.nextLine(); 

		System.out.println("The string you entered is: " + userInput); 

		LengthPrinter userGiven = new LengthPrinter();

		String thePrint = userGiven.thePrint(userInput);
	}

//A seperate method is being used for printing the length. 

	public String thePrint(String userVal){

			System.out.println("The length of the string is : " + userVal.length());

		return userVal;
	}

}