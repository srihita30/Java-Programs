import java.util.ArrayList;

public class PatientObjects{

	private String patient = " "; 
	private ArrayList<Double> readings = new ArrayList<Double>();
	private ArrayList<Double> finalValue = new ArrayList<Double>();
	
	public String getPatient(){
		return this.patient; 
	}

	public ArrayList<Double> getReadings(){
		return this.readings;
	}

	public ArrayList<Double> getFinalValue(){
		return this.finalValue;
	}


	public void setPatient(String patientName){

		this.patient = patientName; 
	}

	public void setReadings(ArrayList<Double> patientReading){

			this.readings = patientReading;
		
	}

	public void setFinalValue(ArrayList<Double> patientFinalValue){

			this.finalValue = patientFinalValue;
		
	}

}
