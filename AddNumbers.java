import java.util.Scanner; 

public class AddNumbers{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 5 numbers to find their sum"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();
    int num3 = num.nextInt();
    int num4 = num.nextInt();
    int num5 = num.nextInt();

    int newArray[] = {num1, num2, num3, num4, num5};

    AddNumbers finalSum = new AddNumbers();
	
	int addingTheNumbers = finalSum.addingTheNumbers(newArray);

	System.out.println("The sum after adding the 5 numbers is " + addingTheNumbers); 

	}


	public int addingTheNumbers(int[] anArray){
		int sumOfNumbers = 0; 

		for( int i = 0; i<anArray.length; i++){
			sumOfNumbers = sumOfNumbers + anArray[i];
		}

		return sumOfNumbers; 
	}


}
