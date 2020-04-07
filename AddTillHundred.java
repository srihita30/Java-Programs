import java.util.Scanner; 
import java.util.ArrayList;

//Until the sum of all the odd numbers crosses 100, this code will keep adding the odd numbers to find the sum. 

public class AddTillHundred{

		public int addNumOdd(){
		
		int sumOfNum = 0;

		Scanner num = new Scanner(System.in);


			// This while loop condition is required to see if the sum crosses 100 and stop adding if it does. 
 
			while(sumOfNum <= 100)
			
			{

					System.out.println("Keep entering the values you want to add and we will stop running once the sum of the odds reaches 100 or more: ");

					int theVal = num.nextInt();

					if( theVal % 2 != 0)
					{
					sumOfNum = sumOfNum + theVal;
					}

			}

			return sumOfNum;
	} 
	
	public static void main(String[] args){
				
			AddTillHundred theSum = new AddTillHundred();

			int addNumOdd = theSum.addNumOdd();

			System.out.println("The sum of the numbers is " + addNumOdd);

	}

}