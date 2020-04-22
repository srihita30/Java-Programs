public class Characteristics{
	
	private int theAge = 0;

	private String nameOfPerson = " ";

	private int weight = 0; 

	public int getTheAge(){
		return this.theAge;
	}

	public String getNameOfPerson(){
		return this.nameOfPerson;
	}

	public int getWeight(){
		return this.weight;
	}

	public void setTheAge(int val){
		if(val>0){

			this.theAge = val;
		
		}
	}

	public void setNameOfPerson(String personName){
		this.nameOfPerson = personName;
	}

	public void setWeight(int personWeight){

		if(personWeight > 0){
			
			this.weight = personWeight;
		
		}
	}

}