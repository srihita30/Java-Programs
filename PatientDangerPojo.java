import java.util.ArrayList;

public class PatientDangerPojo{

	private String thePatient = " "; 

	private int age = 0;

	private int bmi = 0; 

	private int fastingLevel = 0; 

	private int randomLevel = 0; 

	private String riskLevel = "green"; 

	private ArrayList<Double> readings = new ArrayList<Double>();
	
	private ArrayList<Double> finalValue = new ArrayList<Double>();
	
	public String getThePatient(){
		return this.thePatient; 
	}

	public int getAge(){
		return this.age; 
	}

	public int getBmi(){
		return this.bmi; 
	}

	public int getFastingLevel(){
		return this.fastingLevel; 
	}

	public int getRandomLevel(){
		return this.randomLevel; 
	}

	public String getRiskLevel(){
		return this.riskLevel; 
	}

	public ArrayList<Double> getReadings(){
		return this.readings;
	}

	public ArrayList<Double> getFinalValue(){
		return this.finalValue;
	}


	public void setThePatient(String patientsName){

		this.thePatient = patientsName; 
	}

	public int setAge(int patientAge){
		return this.age = patientAge; 
	}

	public int setBmi(int patientBmi){
		return this.bmi = patientBmi; 
	}

	public int setFastingLevel(int patientFastingLevel){
		return this.fastingLevel = patientFastingLevel; 
	}

	public int setRandomLevel(int patientRandomLevel){
		return this.randomLevel = patientRandomLevel; 
	}

	public void setRiskLevel(String itsTheRiskLevel){

		this.riskLevel = itsTheRiskLevel; 
	}

	public void setReadings(ArrayList<Double> patientReading){

			this.readings = patientReading;
		
	}

	public void setFinalValue(ArrayList<Double> patientFinalValue){

			this.finalValue = patientFinalValue;
		
	}

}
