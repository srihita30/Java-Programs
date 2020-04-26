public class Department{
	
	private int id = 0;

	private String nameOfPerson = " ";

	private int salary = 0; 

	public int getId(){
		return this.id;
	}

	public String getNameOfPerson(){
		return this.nameOfPerson;
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

	public void setSalary(int personSalary){

			
			this.salary = personSalary;
		
	}

}