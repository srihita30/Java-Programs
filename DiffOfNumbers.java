import java.util.Scanner; 

public class DiffOfNumbers{

	public static void main (String[] args){

	Scanner num = new Scanner(System.in);

	System.out.println("Enter 2 numbers to find their difference"); 

    int num1 = num.nextInt();
    int num2 = num.nextInt();

    int newArray[] = {num1, num2};

    DiffOfNumbers theDiff = new DiffOfNumbers();
	
	int subtractNumb = theDiff.subtractNumb(newArray);

	System.out.println("The difference after subtracting the 2 numbers is " + subtractNumb); 

	}


	public int subtractNumb(int[] anArray){
		int differenceOfNumbers = 0;
		int i = 0; 

		while(i<anArray.length)
		{
			differenceOfNumbers = anArray[i] -  differenceOfNumbers ;
			i++;
		}

		return differenceOfNumbers; 
	}


}
