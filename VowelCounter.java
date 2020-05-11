import java.util.Scanner; 

/*
@author: Srihita 
Find the number of vowels
Used instance methods and not static methods - as instance methods is the most used.
*/

public class VowelCounter {
	
	public static void main(String[] args) {
		Scanner objString = new Scanner(System.in); 
		System.out.println("Please enter your string value here: "); 

		String userInput = objString.nextLine(); 

		VowelCounter vCount = new VowelCounter(); 

		int userCounter = vCount.myVowelCounter(userInput);
		System.out.println("Number of vowels in the string: " +userCounter); 

	}

		public int myVowelCounter(String myString) {

			int counter = 0;

			for(int i=0; i<myString.length(); i++) {

				if ( (myString.charAt(i) == 'a') || (myString.charAt(i) == 'e') || 
				(myString.charAt(i) == 'i') || (myString.charAt(i) == 'o') || (myString.charAt(i) == 'u') ) {

					counter = counter + 1;
					}
			}
			return counter; 
		}



}