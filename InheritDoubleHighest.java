import java.util.Scanner;

public class InheritDoubleHighest extends FindMaxMethods{

// By using oops this code will find the highest value od an odd numbers array. 

	public static void main(String[] args){

		// Inherits the "FindMaxMethods" class. 

		InheritDoubleHighest theHighest = new InheritDoubleHighest();

		int[] takeUserInput = theHighest.takeUserInput(); 

		int maxValue = theHighest.maxValue(takeUserInput); 

		// Instantiates the "PrinterOFHighest" class. 

		PrinterOFHighest printAnswer = new PrinterOFHighest();

		printAnswer.printerMethod(maxValue);

	}

}



