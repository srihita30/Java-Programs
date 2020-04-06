import java.util.Scanner; 
import java.util.ArrayList;

/*
	Until the user enters zero, this code will be used to calculate the sum of all the integers given by the user.
*/

public class AddTillZeroNumbers{
	
	public static void main(String[] args){
		
		Scanner num = new Scanner(System.in);

				System.out.println("Enter the first number: "); 
					
					// "Val" is the first value to be stored in the array and to be added. 
					
					int val = num.nextInt();

					// We will be using "ArrayList<Integer>" because we do not know the length of the array / the number of values the user wants to input. 

					ArrayList<Integer> anArray = new ArrayList<Integer>();

					// This will store the first value to be added. 

					anArray.add(new Integer(val));

				while(val !=0 ){

					System.out.println("Keep entering the values you want to add and enter zero to stop calculating the sum: ");

					val = num.nextInt();

					anArray.add(new Integer(val));

				}
				
			AddTillZeroNumbers theSum = new AddTillZeroNumbers();

			int addAllNum = theSum.addAllNum(anArray);

	System.out.println("The sum of the numbers is " + addAllNum);

	}

	/*
		This method "addAllNum" will be used to calculate the sum of the numbers in an array. 
	*/

	public int addAllNum(ArrayList<Integer> theArray){
		int sumOfNum = 0;
			int i=0;
			while (i<theArray.size())
			{
				sumOfNum = sumOfNum + theArray.get(i) ;
				i++;
			}

			return sumOfNum;
	} 

}