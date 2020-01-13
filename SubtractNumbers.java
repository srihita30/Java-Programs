import java.util.Scanner; 

public class SubtractNumbers{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 5 numbers to find their difference"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();
    int num3 = num.nextInt();
    int num4 = num.nextInt();
    int num5 = num.nextInt();

    int newArray[] = {num1, num2, num3, num4, num5};

    SubtractNumbers finalDifference = new SubtractNumbers();
	
	int subtractingTheNumbers = finalDifference.subtractingTheNumbers(newArray);

	System.out.println("The difference after subtracting the 5 numbers is " + subtractingTheNumbers); 

	}


	public int subtractingTheNumbers(int[] anArray){
		int differenceOfNumbers = 0; 

		for( int i = 0; i<anArray.length; i++){
			differenceOfNumbers = differenceOfNumbers - anArray[i];
		}

		return differenceOfNumbers; 
	}


}
