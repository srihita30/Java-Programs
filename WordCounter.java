import java.util.Scanner; 

/*
@author: Srihita 
Find the number of words
Used instance methods and not static methods - as instance methods is the most used.
*/

public class WordCounter{
	
	public static void main(String[] args){
		Scanner objString = new Scanner(System.in); 
		System.out.println("Please enter your string value here: "); 

		String userInput = objString.nextLine(); 

		WordCounter myCounter = new WordCounter();
		
		int finalCounter = myCounter.wordNum(userInput);
		System.out.println("The number of words in the string: " +finalCounter); 
	}	


	public int wordNum(String l) {
		int wCounter = 0; 
		int counter = 0; 

		if(l.length() == 0) {
			return 0 ;
		}

		for(int i=0; i<l.length(); i++) {

			if((l.charAt(i) == ' ') ) {
				wCounter = wCounter + 1;  
			}
		}
		
		if(wCounter>0) {
		counter = wCounter + 1;  		


		}
		else {
			counter = 0 ;
		}



		if(counter>0 && l.charAt(0) == ' ') {
			counter = counter - 1 ; 
		}

		if(counter>0 && l.charAt(l.length() - 1) == ' ') {
			counter = counter - 1; 
		}

		return counter;     
	}

}