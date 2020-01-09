public class NewCar extends NewAct implements FreshAct,AnotherAct{

	public static void main(String[] args){
		NewCar nc = new NewCar();

		nc.billPayment();
		nc.doPooja(); 
		nc.giveName();
		nc.giveColour();
	}

	public void billPayment(){
		System.out.println("Pay bill with cash.");
		
	}
	
	public void doPooja(){
		System.out.println("Do pooja at temple.");
	}

	public String giveName(){
		String car="hitusCar"; 
		System.out.println("Give name to the new car");
		return car; 
	}

	public String giveColour(){
		String sameCar ="srihitasCar";
		System.out.println("Choose a colour for the car");
		return sameCar;
	}
}