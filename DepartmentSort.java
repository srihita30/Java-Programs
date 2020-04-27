import java.util.Scanner;

public class DepartmentSort{
	public static void main(String[] args) {

		Scanner department = new Scanner(System.in);

		System.out.println("Enter the number of persons' details for the tech department: ");

			int techDetails = department.nextInt(); 


			Department[] techArray = new Department[techDetails];

			int i = 0;

			while (i < techArray.length){

				department.nextLine(); 

				System.out.println("Enter the Name: ");

				String name = department.nextLine();


				System.out.println("Enter the id: ");

				int id = department.nextInt();

				System.out.println("Enter the salary: "); 

				int salary = department.nextInt();

			


				Department theTechDepartment = new Department();
				theTechDepartment.setNameOfPerson(name);
				theTechDepartment.setId(id);
				theTechDepartment.setSalary(salary);

	  				techArray[i] = theTechDepartment; 

	  				i = i + 1; 
				}

			System.out.println("Enter the number of persons' details for the hr department: ");

			int hrDetails = department.nextInt(); 


			Department[] hrArray = new Department[hrDetails];

			int x = 0;

			while (x < hrArray.length){

				department.nextLine(); 

				System.out.println("Enter the Name: ");

				String name = department.nextLine();


				System.out.println("Enter the id: ");

				int id = department.nextInt();

				System.out.println("Enter the salary: "); 

				int salary = department.nextInt();

			


				Department theHrDepartment = new Department();
				theHrDepartment.setNameOfPerson(name);
				theHrDepartment.setId(id);
				theHrDepartment.setSalary(salary);

	  				hrArray[x] = theHrDepartment; 

	  				x = x + 1; 
				}

			System.out.println("Enter the number of persons' details for the sales department: ");

			int salesDetails = department.nextInt(); 


			Department[] salesArray = new Department[salesDetails];
			//System.out.println("length of sales array : " + salesDetails + " : "+ salesArray.length);

			int z = 0;

			while (z < salesArray.length){

				department.nextLine(); 

				System.out.println("Enter the Name: ");

				String name = department.nextLine();


				System.out.println("Enter the id: ");

				int id = department.nextInt();

				System.out.println("Enter the salary: "); 

				int salary = department.nextInt();

				Department theSalesDepartment = new Department();
				theSalesDepartment.setNameOfPerson(name);
				//	System.out.println("the Name sales : " + name);
				theSalesDepartment.setId(id);
				//	System.out.println("the id sales : " + id);
				theSalesDepartment.setSalary(salary);
				//	System.out.println("the salary sales : " + salary);

	  				salesArray[z] = theSalesDepartment; 

	  				z = z + 1; 
				}

				System.out.println("The control reached here");

				DepartmentSort sorted = new DepartmentSort();
				sorted.departmentTotal(techArray, hrArray, salesArray);
	}

			public void departmentTotal(Department[] tArray, Department[] hArray, Department[] sArray){

				//System.out.println("The control reached here");

				//Department techTotal = new Department();

				int i = 0;

				//techTotal = 0;

				int techTotal = 0; 

				//System.out.println("The control reached here"+ tArray.length +" : "+ tArray[i].getSalary());

				while(i<tArray.length){
					//System.out.println("The control reached while"+ tArray.length +" : "+ tArray[i].getSalary());
					techTotal = techTotal + tArray[i].getSalary();
					//System.out.println("The control finished while here"+ tArray.length +" : "+ tArray[i].getSalary());

					i = i + 1;
				}

				//System.out.println("tech total: " + techTotal);

				//Department hrTotal = new Department();

				int x = 0;

				//hrTotal = 0;

				int hrTotal = 0; 

				while(x<hArray.length){
					hrTotal = hrTotal + hArray[x].getSalary();

					x = x + 1;
				}

				//System.out.println("hr total: " + hrTotal);

				//Department salesTotal = new Department();

				int y = 0;

				//salesTotal = 0;

				int salesTotal = 0; 

				while(y<sArray.length){
					salesTotal = salesTotal + sArray[y].getSalary();

					y = y+1;
				}

				//System.out.println("sales total: " + salesTotal);

				int companyTotal = 0; 

				companyTotal = techTotal + hrTotal + salesTotal; 


				System.out.println("The total payroll for the tech department is: " + techTotal); 
				System.out.println("The total payroll for the hr department is: " + hrTotal); 
				System.out.println("The total payroll for the sales department is: " + salesTotal); 

				System.out.println("The total payroll for the company is: " + companyTotal); 
			}


}