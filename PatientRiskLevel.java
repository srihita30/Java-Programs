import java.util.Scanner;
import java.util.ArrayList;

//This code will take in different readings for different users and set their risk level accordingly. 

public class PatientRiskLevel {
	
	public static void main(String[] args){

		Scanner scannerObj = new Scanner(System.in);

		//Number of patients. 

		System.out.println("Enter the number of patients: ");

		int patientNumber = scannerObj.nextInt();
		
		//int[] nameArray = new int[patientNumber]; //Array is used only for the outer "for loop" sake - length purpose. 

		ArrayList<PatientDangerPojo> patientArray = new ArrayList<PatientDangerPojo>();

			//Loop to take in all of the patient names and details. 

			for(int i = 0; i < patientNumber; i++)

			{
 
				scannerObj.nextLine(); 
				
				System.out.println("Enter the patient name: ");
				
				String name = scannerObj.nextLine();

				System.out.println("Enter the patient age: "); 

				int age = scannerObj.nextInt(); 

				System.out.println("Enter the patient BMI: "); 

				int theBmi = scannerObj.nextInt(); 

				System.out.println("Enter the patient fasting level reading: ");

				int theFastingReading = scannerObj.nextInt();


				System.out.println("Enter the patient random level reading: ");

				int theRandomReading = scannerObj.nextInt();
				
				PatientDangerPojo patientDetails = new PatientDangerPojo();
				
				patientDetails.setThePatient(name); 
				patientDetails.setAge(age); 
				patientDetails.setBmi(theBmi); 
				patientDetails.setFastingLevel(theFastingReading); 
				patientDetails.setRandomLevel(theRandomReading); 
				
				patientArray.add(patientDetails); 
				
				}

			PatientRiskLevel patientObj = new PatientRiskLevel();

			patientObj.patientLevelSorting(patientArray);  
	}

	//This method will sort the patients accordong to certain fixed conditions. 

	public void patientLevelSorting(ArrayList<PatientDangerPojo> arrayOfPatients){

		int maxAge = 45; 
		int maxBmi = 25;
		int maxFastingLevel = 100; 
		int maxRandomLevel = 200; 

		String redLevel = "Red";
		String orangeLevel = "Orange";
		String greenLevel = "Green"; 

		for(int x=0; x<arrayOfPatients.size(); x++ ){

			PatientDangerPojo po = arrayOfPatients.get(x);

			//The following "if" condtions will decide which level the patients belong to. 

			if(po.getFastingLevel() > maxFastingLevel || po.getRandomLevel() > maxRandomLevel )
				{
					if(po.getFastingLevel() > maxFastingLevel && po.getRandomLevel() > maxRandomLevel)

						//If both the sugar levels are greater than max then the patient will be in red. 

					{
						po.setRiskLevel(redLevel);

						System.out.println("The patient is in " + redLevel + " level and their name is " + po.getThePatient()); 
					}

					else if ((po.getFastingLevel() > maxFastingLevel || po.getRandomLevel() > maxRandomLevel) && (po.getAge() > maxAge && po.getBmi() > maxBmi))

						//If either of the sugar levels and both of the age/bmi quantities are greater than max then the patient will be in red.  

					{
						po.setRiskLevel(redLevel); 

						System.out.println("The patient is in " + redLevel + " level and their name is " + po.getThePatient());
					}

					else if((po.getFastingLevel() > maxFastingLevel || po.getRandomLevel() > maxRandomLevel) && (po.getAge() > maxAge || po.getBmi() > maxBmi))

						//If either of the sugar levels and either of the bmi/age quantities are greater than the max then the patient will be orange. 
					
					{
						po.setRiskLevel(orangeLevel); 

						System.out.println("The patient is in " + orangeLevel + " level and their name is " + po.getThePatient());
					}
					
					}

				else

					//For all of the other conditions the patient will be in green. 

				{
						po.setRiskLevel(greenLevel); 

						System.out.println("The patient is in " + greenLevel + " level and their name is " + po.getThePatient());
				}
				
				}


			
		}

	}
