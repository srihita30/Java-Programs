import java.util.Scanner; // import the scanner 

/*
@author: Srihita 
Find middle value
Used instance methods and not static methods - as instance methods is the most used.
*/

public class MidVal {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
			
			System.out.println(" Enter the String ");

				String stringValue = num.nextLine();            

			MidVal m = new MidVal();

			String midV = m.findTheMidVal(stringValue); 
				System.out.println("This is the midvalue of the given string: " +midV);

	}

	public String findTheMidVal(String myString) {  

			String midValOfMyString = null; 

			int midPoint = 0; 

			int length = 0; 

				length = myString.length(); 

					if (length % 2 == 0) {
						midPoint = length/2; 
						midValOfMyString = myString.substring(midPoint-1,midPoint+1); 
						System.out.println(midValOfMyString +":"+midPoint +":"+ length);

					}

					else {
						midPoint = (length+1)/2; 
						midValOfMyString = myString.substring(midPoint-1,midPoint); 
						System.out.println(midValOfMyString +":"+midPoint +":"+ length);
					}


		return midValOfMyString;
		}	
	}


