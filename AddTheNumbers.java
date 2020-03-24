import java.util.Scanner; 

public class AddTheNumbers{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
			
				System.out.println("Enter 2 numbers to find their sum"); 
			
				int num1 = num.nextInt();
				int num2 = num.nextInt();

		int newArray[] = {num1, num2};

	AddTheNumbers theSum = new AddTheNumbers();

	int addNum = theSum.addNum(newArray);

	System.out.println("The sum of the two numbers is " + addNum);

	}

	public int addNum(int[] theArray){
		int sumOfNum = 0;
			for (int i=0; i<theArray.length; i++){
				sumOfNum = sumOfNum + theArray[i];
			}

			return sumOfNum;
	}
}