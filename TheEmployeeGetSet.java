/**
 * This is the Get set class for the "EmployeeGrade" class. 
 *
 *
 * @author Srihita
 *
 **/
public class TheEmployeeGetSet {
		
		private int id = 0;

		private String nameOfPerson = " ";

		private int rating = 0; 

		private String department = " "; 

		public int getId(){
			return this.id;
		}

		public String getNameOfPerson(){
			return this.nameOfPerson;
		}

		public String getDepartment(){
			return this.department;
		}

		public int getRating(){
			return this.rating;
		}

		public void setId(int someID){

				this.id = someID;
		}

		public void setNameOfPerson(String personName){
			this.nameOfPerson = personName;
		}


		public void setDepartment(String departmentName){
			this.department = departmentName;
		}

		public void setRating(int personRating){
			if (personRating > 0 && personRating <10) {
				this.rating = personRating;
			
			}
			}
	
}
