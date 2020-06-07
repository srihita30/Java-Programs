import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

//This code will take in different sugar readings for different users and will average the readings. It will then sort them. 

public class PatientSugarSort{
	
	public static void main(String[] args){

		Scanner scannerObj = new Scanner(System.in);

		//Number of patients. 

		System.out.println("Enter the number of patients: ");

		int patientNumber = scannerObj.nextInt();
		
		System.out.println("Enter the number of readings: ");
		
		int patientReadings = scannerObj.nextInt();

		int[] nameArray = new int[patientNumber]; //Array is used only for the outer "for loop" sake - length purpose. 
		
		int[] readingArray = new int[patientReadings]; //Array is used only for the inner "for loop" sake - length purpose. 

		ArrayList<PatientSugarSortPojo> patientArray = new ArrayList<PatientSugarSortPojo>();

			//Loop to take in all of the patient name and reading. 

			for(int i = 0; i < nameArray.length; i++)

			{

				scannerObj.nextLine(); 
				
				System.out.println("Enter the patient name: ");
				
				String name = scannerObj.nextLine();
				
				PatientSugarSortPojo patientNameAndReading = new PatientSugarSortPojo();
				
				patientNameAndReading.setPatient(name); 
				
				ArrayList<Double> arrayOfReadings = new ArrayList<Double>();

				
					for(int y = 0; y<readingArray.length; y++) 

					{

						//System.out.println("The length of the reading array is " + readingArray.length); 

						System.out.println("Enter the patient's reading: "); 

						int theReading = scannerObj.nextInt();
				
						arrayOfReadings.add((double) theReading);

						//System.out.println("The patient's reading is at this value of the index: " + readingArray[y]); 
	  			
					}
				
				patientNameAndReading.setReadings(arrayOfReadings); 
				
				patientArray.add(patientNameAndReading); 
				
				}

			PatientSugarSort patientObj = new PatientSugarSort();

			patientObj.thePatientReading(patientArray); 
			patientObj.patientReadingSorter(patientArray);
	}

	//This code is the logic behind the percentage change. 

	public void thePatientReading(ArrayList<PatientSugarSortPojo> arrayOfPatients){

		/*

		The formula for the percentage change i.e. percentage change = ((final-initial)/initial) * 100 is divided into three parts : the difference, the division part, and the percentage part. 

		The final value i.e. the percentage change value is then set and printed. 

		*/

		double diffOfReadings = 0;
		double varianceOfReadings = 0;
		double percentageChange = 0; 

		for(int x=0; x<arrayOfPatients.size(); x++ ){

			PatientSugarSortPojo po = arrayOfPatients.get(x);

			ArrayList<Double> percentageDifference = new ArrayList<Double>();

			System.out.println("The name of the patient is: " + po.getPatient()); 

				for(int a = 0; a<po.getReadings().size() - 1 ; a++){

					diffOfReadings = po.getReadings().get(a+1) - po.getReadings().get(a);

					varianceOfReadings = diffOfReadings/po.getReadings().get(a);

					percentageChange = varianceOfReadings * 100; 

					percentageDifference.add(percentageChange);

					po.setFinalValue(percentageDifference); 

				System.out.println("And this patient's final reading after the percentage change has been calculated is " + percentageChange); 

				}

		}

	}

	public void patientReadingSorter ( ArrayList<PatientSugarSortPojo> theArrayForReadings){

						//Usuing "Collections.sort()" to sort the elements of the list. 

				 Collections.sort(theArrayForReadings, Collections.reverseOrder());

				for(int x = 0; x<theArrayForReadings.size(); x++){

					for(int y = 0; y<theArrayForReadings.size(); y++){

						System.out.println("The name of the patient is " + (theArrayForReadings.get(x)).getPatient() + " and this patient's reading is " + (theArrayForReadings.get(x).getFinalValue().get(y)));

					}

				}

		}

	}

