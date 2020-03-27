import java.util.Scanner; 

public class CharPrinter{

//This class will be used to print all the characters of a string seperately. 

	public static void main(String[] args) {
		Scanner objString = new Scanner(System.in); 
		
		System.out.println("Please enter your string value here: "); 

		String userInput = objString.nextLine(); 

		System.out.println("The string you entered is: " + userInput); 

		CharPrinter userGiven = new CharPrinter();

		String thePrint = userGiven.thePrint(userInput);
	}

//A seperate method is being used for printing the characters one by one. 

	public String thePrint(String userVal){

			for(int i=0; i < userVal.length(); i++)
		{
			System.out.println("The " + i + " character in the string is : " + userVal.charAt(i));
		}

		return userVal;
	}

}