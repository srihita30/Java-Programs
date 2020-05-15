import java.util.Scanner;

//This code will take in the user sugar level readings and then determine the percentage change in the readings. 

public class PatientReadings{

	public static void main(String[] args){

		Scanner scannerObj = new Scanner(System.in);

		//Number of patients. 

		System.out.println("Enter the patient name: ");

		String name = scannerObj.nextLine();

		System.out.println("Enter the number of readings: ");

		int patientDetails = scannerObj.nextInt();

		Patient[] theArray = new Patient[patientDetails]; 

		int i = 0;

			//Loop to take in all of the employee details. 

			while (i < theArray.length){

				System.out.println("Enter the patient reading: "); 

				int reading = scannerObj.nextInt();
				

				Patient thePatient = new Patient();
				thePatient.setReading(reading);

	  				theArray[i] = thePatient; 

	  				i = i + 1; 
				}


				PatientReadings patientObj = new PatientReadings();

				patientObj.thePatientReading(theArray); 
	}

	//This code is the logic behind the percentage change. 

	public void thePatientReading(Patient[] anArray){

		double percentageDifference = 0;
		double percentageChange = 0;
		double finalAnswer = 0; 

		for(int x=0; x<anArray.length-1; x++){

			percentageDifference = ((anArray[x+1].getReading())-(anArray[x].getReading()));

			//System.out.println("This is the difference of the numbers entered: " + percentageDifference);

			percentageChange = (percentageDifference)/anArray[x].getReading();

			//System.out.println("This is the change value of the numbers entered: " + percentageChange);

			finalAnswer = percentageChange * 100; 

				System.out.println("The final percentage i.e. the percentage change according to the reading is: " + finalAnswer);
		}

	}
}