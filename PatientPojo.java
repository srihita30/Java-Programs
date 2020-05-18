public class PatientPojo{

	private int readingOne = 0;
	private int readingTwo = 0;  
	private String patient = " "; 


	public int getReadingOne(){
		return this.readingOne;
	}

	public int getReadingTwo(){
		return this.readingTwo;
	}

	public String getPatient(){
		return this.patient; 
	}

	public void setReadingOne(int patientreadingOne){

			this.readingOne = patientreadingOne;
		
	}

	public void setReadingTwo(int patientreadingTwo){

			this.readingTwo = patientreadingTwo;
		
	}

	public void setPatient(String patientName){

		this.patient = patientName; 
	}
}