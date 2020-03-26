import java.util.Scanner; 

public class StringPrinter{
	
	public static void main(String[] args) {
		Scanner objString = new Scanner(System.in); 
		System.out.println("Please enter your string value here: "); 

		String userInput = objString.nextLine(); 

		System.out.println("The string you entered is: " + userInput); 

	}

}