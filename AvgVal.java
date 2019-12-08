import java.util.Scanner;

public class AvgVal{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in); //Create a new object
		
		System.out.println("Please enter the first number: ");
		int val1 = obj.nextInt();

		System.out.println("Please enteer the second value: "); 
		int val2 = obj.nextInt();

		System.out.println("Please enter the third value: "); 
		int val3 =obj.nextInt();

		System.out.println("Please enter the fourth value: "); 
		int val4 = obj.nextInt();

		int theArray[] = {val1, val2, val3, val4}; 

		AvgVal x = new AvgVal(); 

		int findTheAvgVal = x.findTheAvgVal(theArray);

		System.out.println("The average value of all the non-zero values enetered is = " + findTheAvgVal);
	}

	public int findTheAvgVal(int[] totalAvg) {
		int count = 0;
		int total = 0;
		int theAvgVal = 0;  

		for(int i = 0; i < totalAvg.length; i++) { 
			if (totalAvg[i] > 0) {
				count = count + 1;
				total = total + totalAvg[i]; 
			}
		}

		if (count != 0) {
			theAvgVal = total/count;
		}

		return theAvgVal;
	}
}