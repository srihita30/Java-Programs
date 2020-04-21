import java.util.Scanner;

public class TempConverter{
	public static void main(String args[]){
		Scanner temp = new Scanner(System.in);

		System.out.println("Input a degree in celsius:");

		int degree = temp.nextInt();

		TempConverter tVal = new TempConverter();
		int findTheTempInKelvin = tVal.findTheTempInKelvin(degree); 

		System.out.println("The degree in kelvin is: " +findTheTempInKelvin); 
	}
public int findTheTempInKelvin(int myTemp){
	int finalTemp;
	
			finalTemp = myTemp + 273; 
	
		return finalTemp;
	}

}