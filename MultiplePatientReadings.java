import java.util.Scanner;

//This code will take in the user sugar level readings for multiple users and then determine the percentage change in the readings. 

public class MultiplePatientReadings{

	public static void main(String[] args){

		Scanner scannerObj = new Scanner(System.in);

		//Number of patients. 


		System.out.println("Enter the number of patients: ");

		int patientNumber = scannerObj.nextInt();

		PatientPojo[] theArray = new PatientPojo[patientNumber]; 

		int i = 0;

			//Loop to take in all of the patient details. 

			while (i < theArray.length){

				scannerObj.nextLine(); 

				System.out.println("Enter the patient name: ");

				String name = scannerObj.nextLine();

				System.out.println("Enter the patient's 1st reading: "); 

				int firstReading = scannerObj.nextInt();

				System.out.println("Enter the patient's 2nd reading: "); 

				int secondReading = scannerObj.nextInt();

				PatientPojo patientNameAndReading = new PatientPojo();

					patientNameAndReading.setReadingOne(firstReading);

					patientNameAndReading.setReadingTwo(secondReading);
					
					patientNameAndReading.setPatient(name); 

	  				theArray[i] = patientNameAndReading; 

	  			i = i + 1; 
				
				}

				MultiplePatientReadings patientObj = new MultiplePatientReadings();

				patientObj.thePatientReading(theArray); 
	}

	//This code is the logic behind the percentage change. 

	public void thePatientReading(PatientPojo[] patientArray){

		double percentageDifference = 0;
		double percentageChange = 0;
		double finalAnswer = 0; 

		for(int x=0; x<patientArray.length; x++){

			percentageDifference = ((patientArray[x].getReadingTwo())-(patientArray[x].getReadingOne()));

			//System.out.println("This is the difference of the numbers entered: " + percentageDifference);

			percentageChange = (percentageDifference)/patientArray[x].getReadingOne();

			//System.out.println("This is the change value of the numbers entered: " + percentageChange);

			finalAnswer = percentageChange * 100; 

				System.out.println("The final percentage i.e. the percentage change according to the reading of the patient " + patientArray[x].getPatient() + " is: " + finalAnswer);
		}

	}
}