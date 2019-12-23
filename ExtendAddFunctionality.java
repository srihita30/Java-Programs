import java.util.Scanner; 

public class ExtendAddFunctionality{
	public static void main (String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter any 5 numbers to add ");

		int num1 = obj.nextInt();

		int num2 = obj.nextInt();

		int num3 = obj.nextInt();

		int num4 = obj.nextInt();
		
		int num5 = obj.nextInt(); 

		int newArray[] = {num1, num2, num3, num4, num5};

		AddNumbers an = new AddNumbers(); 

		int addingTheNumbers = an.addingTheNumbers(newArray);

		System.out.println("The sum of all of the 5 numbers entered is " + addingTheNumbers);

	}
}
