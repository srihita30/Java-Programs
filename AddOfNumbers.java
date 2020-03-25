import java.util.Scanner; 

public class AddOfNumbers{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
			
				System.out.println("Enter 2 numbers to find their sum"); 
			
				int num1 = num.nextInt();
				int num2 = num.nextInt();

		int newArray[] = {num1, num2};

	AddOfNumbers theSum = new AddOfNumbers();

	int addTheNum = theSum.addTheNum(newArray);

	System.out.println("The sum of the two numbers is " + addTheNum);

	}

	public int addTheNum(int[] theArray){
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