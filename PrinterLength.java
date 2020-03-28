import java.util.Scanner; 

public class PrinterLength{

//This class will be used to print the length of a string w/o using .length(). 

	public static void main(String[] args) {
		Scanner objString = new Scanner(System.in); 
		
		System.out.println("Please enter your string here: "); 

		String userInput = objString.nextLine(); 

		System.out.println("The string you entered is: " + userInput); 

		PrinterLength userGiven = new PrinterLength();

		int counterVal = userGiven.thePrinter(userInput);

		System.out.println("The length of the string is : " + counterVal);
	}

//A seperate method is being used for printing the length. 

	public int thePrinter(String userValue){
			int counter = 0;

			for(int i=0; i < userValue.length(); i++)
			{
				counter = counter + 1;

				if(userValue.charAt(i) == ' ' )
				{
						//System.out.println(" inside if "+ userValue.charAt(i) +"done " );
						counter = counter - 1; 
				}

			}

		return counter;
	}

}

// what is the problem statement???? 