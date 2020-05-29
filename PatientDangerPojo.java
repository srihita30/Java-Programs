import java.util.ArrayList;

public class PatientDangerPojo{

	private String thePatient = " "; 
	private String dangerZone = "green"; 
	private ArrayList<Double> readings = new ArrayList<Double>();
	private ArrayList<Double> finalValue = new ArrayList<Double>();
	
	public String getThePatient(){
		return this.thePatient; 
	}

	public String getDangerZone(){
		return this.dangerZone; 
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

	public void setDangerZone(String itsTheDangerZone){

		this.dangerZone = itsTheDangerZone; 
	}

	public void setReadings(ArrayList<Double> patientReading){

			this.readings = patientReading;
		
	}

	public void setFinalValue(ArrayList<Double> patientFinalValue){

			this.finalValue = patientFinalValue;
		
	}

}
