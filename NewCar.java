public class NewCar extends NewAct{

	public static void main(String[] args){
		NewCar nc = new NewCar();

		nc.billPayment();
		nc.doPooja(); 
	}

	public void billPayment(){
		System.out.println("Pay bill with cash.");
		
	}
	
	public void doPooja(){
		System.out.println("Do pooja at temple.");
	}
}