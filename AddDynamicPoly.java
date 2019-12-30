import java.util.Scanner; 

public class AddDynamicPoly extends AddNumbers{

	public static void main (String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any 5 numbers to add ");

		int num1 = obj.nextInt();

		int num2 = obj.nextInt();

		int num3 = obj.nextInt();

		int num4 = obj.nextInt();
		
		int num5 = obj.nextInt(); 

		int newArray[] = {num1, num2, num3, num4, num5};

		AddNumbers op = new AddDynamicPoly(); 
		
		//	AddNumbers op = new AddNumbers();

		int addingTheNumbers = op.addingTheNumbers(newArray);
		
		System.out.println("The sum of all the 5 numbers entered is  " + addingTheNumbers);

	}

	public int addingTheNumbers(int[] anArray){
		int sumOfNumbers = 0; 

		for( int i = 0; i<anArray.length; i++){
			sumOfNumbers = sumOfNumbers + anArray[i];
		}

		System.out.println("The sum of all the nunbers is" + sumOfNumbers);

		return sumOfNumbers; 
	}
	
}