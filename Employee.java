public class Employee{
	
	private int id = 0;

	private String nameOfPerson = " ";

	private int salary = 0; 

	private String department = " "; 

	public int getId(){
		return this.id;
	}

	public String getNameOfPerson(){
		return this.nameOfPerson;
	}

	public String department(){
		return this.department;
	}

	public int getSalary(){
		return this.salary;
	}

	public void setId(int someID){

			this.id = someID;
	}

	public void setNameOfPerson(String personName){
		this.nameOfPerson = personName;
	}


	public void department(String departmentName){
		this.department = departmentName;
	}

	public void setSalary(int personSalary){

			
			this.salary = personSalary;
		
	}
}