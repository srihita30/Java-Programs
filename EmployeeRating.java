import java.util.Scanner;
import java.util.ArrayList;

//After the user enters the employee details like the name, id, department, and rating, the avergae of all the ratings will be calculated and the ratings which are greater than the average will be returned. 

public class EmployeeRating{
	public static void main(String[] args){

		Scanner scannerObj = new Scanner(System.in);

		//Number of employees. 

		System.out.println("Enter the number of employees for sorting: ");

		int employeeDetails = scannerObj.nextInt();

		Rating[] theArray = new Rating[employeeDetails]; 

		int i = 0;

			//Loop to take in all of the employee details. 

			while (i < theArray.length){

				scannerObj.nextLine();

				System.out.println("Enter the employee name: ");

				String name = scannerObj.nextLine();

				System.out.println("Enter the employee department: "); 

				String department = scannerObj.nextLine();

				System.out.println("Enter the employee ID: ");

				int id = scannerObj.nextInt();

				System.out.println("Enter the employee rating: "); 

				int rating = scannerObj.nextInt();
				

				Rating anEmployee = new Rating();
				anEmployee.setNameOfPerson(name);
				anEmployee.setDepartment(department);
				anEmployee.setId(id);
				anEmployee.setRating(rating);

	  				theArray[i] = anEmployee; 

	  				i = i + 1; 
				}


				EmployeeRating employeeObj = new EmployeeRating();

				ArrayList<Rating> employeeAvgRating = employeeObj.employeeAvgRating(theArray); 

				//Loop to print all the values which are gretater than the average. 

				for(int s = 0; s<employeeAvgRating.size(); s++){
					System.out.println("The employee with higher than average rating are: " + employeeAvgRating.get(s).getNameOfPerson() + " and her/his rating is "+ employeeAvgRating.get(s).getRating());
				}
	}

	public ArrayList<Rating> employeeAvgRating(Rating[] anArray){

				ArrayList<Rating> higherThanAvg = new ArrayList<Rating>();
				
				//Variables for the sum, average, and counter(of the number if numbers/rating values). 
				int sumOfRating = 0;
				int avgRating = 0; 
				int counterVal = 0;

				//Loop to calculate the sum. 

				for(int x=0; x<anArray.length; x++){

						sumOfRating = sumOfRating + anArray[x].getRating(); 
						counterVal = counterVal + 1; 
				}

				//Equation to calculate the average. 

				avgRating = sumOfRating/counterVal; 

				System.out.println("The average of the ratings is " + avgRating);

				int z=0;

				//Loop to compare and find the ratings which are higher than the average. 

				while( z<anArray.length){

					if(anArray[z].getRating() > avgRating){

						higherThanAvg.add(anArray[z]); 

					}

					z = z +1; 

				}
					
					return higherThanAvg;

				/*
				for(int y=0; y<higherThanAvg.size(); y++){
					System.out.println("The employees with higher than average ratings are: " + higherThanAvg);
				}
				*/
	}
}