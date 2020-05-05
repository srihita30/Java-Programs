import java.util.Collections; 
import java.util.Scanner;
import java.util.ArrayList; 

/*
* Take input of all the employee detals. 
* Print the ratings in ascending order of ratings. 
*/

public class EmployeeGrade {
	
	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		
		//Number of employees. 
		
		System.out.println("Enter the number of employees for sorting: "); 
		
		int employeeDetails = scannerObj.nextInt();

		ArrayList<TheEmployeeRating> listOfEmployees = new ArrayList<TheEmployeeRating>();
		 
		 int i = 0; 
		 
		 //Loop to take in all of the employee details and to add to array list. 
		 
		 while (i < employeeDetails){

				scannerObj.nextLine();

				System.out.println("Enter the employee name: ");

				String name = scannerObj.nextLine();

				System.out.println("Enter the employee department: "); 

				String department = scannerObj.nextLine();

				System.out.println("Enter the employee ID: ");

				int id = scannerObj.nextInt();

				System.out.println("Enter the employee rating: "); 

				int rating = scannerObj.nextInt();


				TheEmployeeRating theEmployeeObject = new TheEmployeeRating();
				theEmployeeObject.setNameOfPerson(name);
				theEmployeeObject.setId(id);
				theEmployeeObject.setDepartment(department);
				theEmployeeObject.setRating(rating);


				
	  			listOfEmployees.add(theEmployeeObject);

	  				i = i + 1; 
				}


				//Usuing "Collections.sort()" to sort the elements of the list. 

				Collections.sort(listOfEmployees);

				for(int x = 0; x<listOfEmployees.size(); x++){

					//Printing the ratings in the order. 
					/*
					TheEmployeeRating eo = listOfEmployees.get(x);
					String en = eo.getNameOfPerson();
					int er = eo.getRating();
					System.out.println("The name of the person is " + en + " and their rating is: " + er );
					*/

					System.out.println("The name of the person is " + (listOfEmployees.get(x)).getNameOfPerson()+ " and this person's rating is " + (listOfEmployees.get(x)).getRating());
				}

	}

}
