import java.util.Scanner; 

//This code will take in the BMI value and place you in a category. 

public class BmiCategory{

	public static void main(String[] args){

		Scanner num = new Scanner(System.in);

		System.out.println("Enter your BMI:");
		double num1 = num.nextDouble();

		BmiCategory bmiValue = new BmiCategory();
		bmiValue.categoryOfTheEnteredBmi(num1);

		}

	public void categoryOfTheEnteredBmi(double theBmi){

	
			if (theBmi<=18.5)
			{
				System.out.println("You are in the underweight category"); 
			}

			if (theBmi>18.5 && theBmi<=24.9)
			{
				System.out.println("You are in the normal weight category"); 		
			}

			if (theBmi>=25 && theBmi<=29.9)
			{
				System.out.println("You are in the overweight category"); 		
			}


			if (theBmi>=30)
			{
				System.out.println("You are in the obese category"); 		
			}
		
		
	}

}
