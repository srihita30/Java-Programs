import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/*
* Take input of all the employee details. 
* Print the ratings in ascending order of ratings. 
* And print the grade of the employees according to their rating.  
*/

public class EmployeesInOrder {
	
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

					//Usuing "Collections.sort()" to sort the elements of the list. 

				Collections.sort(listOfEmployees, Collections.reverseOrder());

				for(int x = 0; x<listOfEmployees.size(); x++){

					if(x<(listOfEmployees.size()/10)){

						System.out.println("The name of the person who got an A is " + (listOfEmployees.get(x)).getNameOfPerson()+ " and this person's rating is " + (listOfEmployees.get(x)).getRating());
						(listOfEmployees.get(x)).setGrade("A");
					}

					if((x>=(listOfEmployees.size()/10) && x<(3*(listOfEmployees.size())/10))){

						System.out.println("The name of the person who got a B is " + (listOfEmployees.get(x)).getNameOfPerson()+ " and this person's rating is " + (listOfEmployees.get(x)).getRating());
						(listOfEmployees.get(x)).setGrade("B");

					}


					if(x>=(3*(listOfEmployees.size())/10) && x<(7*(listOfEmployees.size())/10)){

						System.out.println("The name of the person who got a C is " + (listOfEmployees.get(x)).getNameOfPerson() + " and this person's rating is " + (listOfEmployees.get(x)).getRating());
						(listOfEmployees.get(x)).setGrade("C");
					}


					if(x>=(7*(listOfEmployees.size())/10) && x<(9*(listOfEmployees.size())/10)){

						System.out.println("The name of the person who got a D is " + (listOfEmployees.get(x)).getNameOfPerson()+ " and this person's rating is " + (listOfEmployees.get(x)).getRating());
						(listOfEmployees.get(x)).setGrade("D");

					}


					if(x>=(9*(listOfEmployees.size())/10) && x<listOfEmployees.size()){

						System.out.println("The name of the person who got an E is " + (listOfEmployees.get(x)).getNameOfPerson()+ " and this person's rating is " + (listOfEmployees.get(x)).getRating());
						(listOfEmployees.get(x)).setGrade("E");
					}

				}

	}


}
