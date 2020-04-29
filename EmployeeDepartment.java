import java.util.Scanner;
//This class will take input about the employee details from the use and will calcuate the payroll for the whole company and each department accordingly. 
public class EmployeeDepartment{
	public static void main(String[] args){

		Scanner employee = new Scanner(System.in);

		//Number of employees. 

		System.out.println("Enter the number of employees for sorting: ");

			int employeeDetails = employee.nextInt(); 

			Employee[] theArray = new Employee[employeeDetails]; 

			int i = 0;

			//Loop to take in details. 

			while (i < theArray.length){

				employee.nextLine();

				System.out.println("Enter the employee name: ");

				String name = employee.nextLine();

				System.out.println("Enter the employee department: "); 

				String department = employee.nextLine();

				System.out.println("Enter the employee ID: ");

				int id = employee.nextInt();

				System.out.println("Enter the employee salary: "); 

				int salary = employee.nextInt();
				

				Employee theEmployee = new Employee();
				theEmployee.setNameOfPerson(name);
				theEmployee.setDepartment(department);
				theEmployee.setId(id);
				theEmployee.setSalary(salary);

	  				theArray[i] = theEmployee; 

	  				i = i + 1; 
				}

				EmployeeDepartment employeeInfo = new EmployeeDepartment();
				employeeInfo.calculatePayRoll(theArray);
	}

	public void calculatePayRoll(Employee[] anArray){
		//int i = 0;

		int techTotal = 0; 

		int hrTotal = 0; 

		int salesTotal = 0; 

		int companyTotal = 0;

		//Employee theDepartment = new Employee();

		//System.out.println("reached here");

		//Loop to calculate the payroll of each department through "if" conditions for deciding the department and calculating accordingly. 

		for(int i = 0; i<anArray.length; i++){

			//System.out.println("array length: " + anArray.length + " the place is " + anArray[i].getDepartment());

			if(anArray[i].getDepartment().equals("tech")){

				//System.out.println("control is here: " + anArray[i].getDepartment());
				techTotal = techTotal + anArray[i].getSalary();
				//System.out.println("control is here: " + anArray[i].getDepartment());
				//System.out.println("techtotal: " + techTotal);
			}

			else if(anArray[i].getDepartment().equals("hr")){
				//System.out.println("control is here: " + anArray[i].getDepartment());
				hrTotal = hrTotal + anArray[i].getSalary();
				//System.out.println("hrtotal: " + anArray[i].getDepartment());
				//System.out.println("hrtotal: " + hrTotal);
			}

			else if(anArray[i].getDepartment().equals("sales")){
				//System.out.println("control is here: " + anArray[i].getDepartment());
				salesTotal = salesTotal + anArray[i].getSalary();
				//System.out.println("control is here: " + anArray[i].getDepartment());
				//System.out.println("salesTotal: " + salesTotal);
			}

			else{

			}

			//i = i +1;
		}

		//This will calculate the payroll of the whole compnay by adding all the payroll's of all the other departments. 

		companyTotal = techTotal + hrTotal + salesTotal; 

		//Now we will print the payrolls.  

		System.out.println("The total payroll for the tech department is: " + techTotal);
		System.out.println("The total payroll for the hr department is: " + hrTotal);
		System.out.println("The total payroll for the sales department is: " + salesTotal);
		System.out.println("The total payroll for the whole company is: " + companyTotal);
	}
}