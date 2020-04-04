import java.util.Scanner; 

/*
This code will be used to calculate the sum of all the integers given by the user. Here, the number of entries (of integers) is specified by the user herself. 
*/


public class AddUserNumbers{
	
	public static void main(String[] args){
		
		Scanner num = new Scanner(System.in);
	
				System.out.println("Enter the number of values for which you want to find the sum :"); 
					
					// "num1" is the number of integers to be entered by the user. 
					
					int num1 = num.nextInt();

					// This array will be used to store all of the values to be entered by the user. 

					int[] allTheValues = new int[num1];

				for(int n=0; n<allTheValues.length; n++){

					System.out.println("Enter the " + n + " value: ");

					int val = num.nextInt();

					allTheValues[n] = val ;

					//System.out.println(" Debug statement in main for : the value is : " + val);
				}
				
			AddUserNumbers theSum = new AddUserNumbers();

			int addUserNum = theSum.addUserNum(allTheValues);

	System.out.println("The sum of the numbers is " + addUserNum);

	}

	/*
		This method "addUserNum" will be used to calculate the sum of the numbers in an array. 
	*/

	public int addUserNum(int[] theArray){
		int sumOfNum = 0;
			int i=0;
			while (i<theArray.length)
			{
				sumOfNum = sumOfNum + theArray[i];
				i++;
			}

			return sumOfNum;
	} 

}