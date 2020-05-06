public class EmployeePojo implements Comparable<EmployeePojo> {

	private String nameOfPerson = " ";

	private int rating = 0; 

	private int id = 0;

	private String grade = " ";



		public String getNameOfPerson(){
			return this.nameOfPerson;
		}

		public int getRating(){
			return this.rating;
		}

		public int getId(){
			return this.id;
		}

		public String getGrade(){
			return this.grade;
		}

		public void setNameOfPerson(String personName){
			this.nameOfPerson = personName;
		}

		public void setRating(int personRating){
			if(personRating>0) {
				this.rating = personRating;
			}
		}

		public void setId(int someID){

				this.id = someID;
		}

		public void setGrade(String employeeGrade){
			this.grade = employeeGrade;
		}


		public int compareTo(EmployeePojo employeeRating){

			if(rating == employeeRating.rating){

				return 0;
			}

			else if(rating>employeeRating.rating) {

				return 1;
			}

			else{

				return -1; 
			}
		}
		
}