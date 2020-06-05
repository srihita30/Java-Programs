import java.util.ArrayList;

public class PatientSugarSortPojo implements Comparable<PatientSugarSortPojo>{

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

	public int compareTo(PatientSugarSortPojo patientFinalReading){

		int resultValue = 0;

		for(int x = 0; x<finalValue.size(); x++)

		{
			for(int y = 0; y<finalValue.size(); y++ )

				if(finalValue.get(x) == patientFinalReading.finalValue.get(y)){

					resultValue =  0;

				}

				else if(finalValue.get(x) > patientFinalReading.finalValue.get(y)) {

					resultValue =  1;

				}

				else{

					resultValue =  -1; 
				}

		}

		return resultValue;


	}

}
