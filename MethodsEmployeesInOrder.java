import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/*
* Take input of all the employee details. 
* Print the ratings in ascending order of ratings. 
* And print the grade of the employees according to their rating.  
*/

public class MethodsEmployeesInOrder {
	
	public static void main(String[] args){

		Scanner scannerObj = new Scanner(System.in);

		//Number of employees. 

		System.out.println("Enter the number of employees: ");

		int employeeDetails = scannerObj.nextInt();

		ArrayList<EmployeePojo> listOfEmployees = new ArrayList<EmployeePojo>();

		 int i = 0; 
		 
		 //Loop to take in all of the employee details and to add to array list. 
		 
		  while (i < employeeDetails){

				scannerObj.nextLine();

				System.out.println("Enter the employee name: ");

				String name = scannerObj.nextLine();

				System.out.println("Enter the employee ID: ");

				int id = scannerObj.nextInt();

				System.out.println("Enter the employee rating: "); 

				int rating = scannerObj.nextInt();


				EmployeePojo theEmployeeObject = new EmployeePojo();
				theEmployeeObject.setNameOfPerson(name);
				theEmployeeObject.setId(id);
				theEmployeeObject.setRating(rating);


				
	  			listOfEmployees.add(theEmployeeObject);

	  				i = i + 1; 
				}

				MethodsEmployeesInOrder employeeObj = new MethodsEmployeesInOrder();

				employeeObj.employeeGrader(listOfEmployees); 

			}

				
			public void employeeGrader(ArrayList<EmployeePojo> anArray){

						//Usuing "Collections.sort()" to sort the elements of the list. 

				 Collections.sort(anArray, Collections.reverseOrder());

				for(int x = 0; x<anArray.size(); x++){

					if(x<(anArray.size()/10)){

						System.out.println("The name of the person who got an A is " + (anArray.get(x)).getNameOfPerson()+ " and this person's rating is " + (anArray.get(x)).getRating());
						(anArray.get(x)).setGrade("A");
					}

					if((x>=(anArray.size()/10) && x<(3*(anArray.size())/10))){

						System.out.println("The name of the person who got a B is " + (anArray.get(x)).getNameOfPerson()+ " and this person's rating is " + (anArray.get(x)).getRating());
						(anArray.get(x)).setGrade("B");

					}


					if(x>=(3*(anArray.size())/10) && x<(7*(anArray.size())/10)){

						System.out.println("The name of the person who got a C is " + (anArray.get(x)).getNameOfPerson() + " and this person's rating is " + (anArray.get(x)).getRating());
						(anArray.get(x)).setGrade("C");
					}


					if(x>=(7*(anArray.size())/10) && x<(9*(anArray.size())/10)){

						System.out.println("The name of the person who got a D is " + (anArray.get(x)).getNameOfPerson()+ " and this person's rating is " + (anArray.get(x)).getRating());
						(anArray.get(x)).setGrade("D");

					}


					if(x>=(9*(anArray.size())/10) && x<anArray.size()){

						System.out.println("The name of the person who got an E is " + (anArray.get(x)).getNameOfPerson()+ " and this person's rating is " + (anArray.get(x)).getRating());
						(anArray.get(x)).setGrade("E");
					}

				}

	}


}
