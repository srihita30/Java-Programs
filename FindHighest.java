import java.util.Scanner; 

public class FindHighest{

	// This code will find the highest value of 5 values entered. 

	public static void main (String[] args){

		Scanner num = new Scanner(System.in);

		// This array will store the values one by one after satisfying the "if" condition in the while loop. 

	  	int[] theArray = new int[5];

	  	int i = 0; 

	  	while( i < 5 ){

			System.out.println("Enter the value: "); 
	  		
			// "num1" is for storing the user entered values. 

	  		int num1 = num.nextInt();

	  			// array will keep taking values until it contains odd values only. 

	  		if(num1 % 2 != 0){

	  			theArray[i] = num1; 

	  			i = i + 1; 

	  		}

  		}

	    FindHighest finalAnswer = new FindHighest();
		
		int FindTheNumber = finalAnswer.FindTheNumber(theArray);

		System.out.println("The highest of the 5 numbers is " + FindTheNumber); 

	}


		// This method "FindTheNumber", is the logic for finding the highest value in the array. 

	public int FindTheNumber(int[] anArray){
		int max = anArray[0]; 

		if(anArray[1]>max){
			max =  anArray[1];

			//System.out.println("DeBUG print max " + max); 
		}

		if(anArray[2]>max){
			max =  anArray[2];

			//System.out.println("DeBUG print max " + max); 
		}
		

		if(anArray[3]>max){
			max =  anArray[3];

			//System.out.println("DeBUG print max " + max); 
		}

		if(anArray[4]>max){
			max =  anArray[4];

			//System.out.println("DeBUG print max " + max); 
		}

		//System.out.println("DeBUG print max " + max); 

		return max;
	
	}


}
