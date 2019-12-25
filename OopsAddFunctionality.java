import java.util.Scanner; 
//import AddNumbers;

public class OopsAddFunctionality extends AddNumbers{
	public static void main (String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any 5 numbers to add ");

		int num1 = obj.nextInt();

		int num2 = obj.nextInt();

		int num3 = obj.nextInt();

		int num4 = obj.nextInt();
		
		int num5 = obj.nextInt(); 

		int newArray[] = {num1, num2, num3, num4, num5};
		
		OopsAddFunctionality op = new OopsAddFunctionality();
		int addingTheNumbers = op.addition(newArray);
		
		System.out.println("The sum of all the 5 numbers entered is " + addingTheNumbers);

	}

	public int addition(int arr[]){
		int additionNum = 0;
		
		 additionNum = super.addingTheNumbers(arr);
		
		return additionNum;
	}
}