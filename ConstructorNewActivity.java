import java.util.Scanner;

public class ConstructorNewActivity{

	ConstructorNewActivity(String poojaType){
		if(poojaType.equals("car")){
			System.out.println("Do Pooja at temple.");
		}
		else {
			System.out.println("Do pooja at home.");
		}
	}


	public static void main(String[] args) {
		System.out.println("Buy any one of the two items: a car or a watch!!");

		Scanner itemList = new Scanner(System.in);
		String item = itemList.nextLine();
		ConstructorNewActivity perform = new ConstructorNewActivity(item);
		//perform.doPooja(item); 
		perform.payBill(item);


	}

	public void doPooja(String performPooja){

		if(performPooja.equals("car")){
			System.out.println("Do Pooja at temple.");
		}

		else {
			System.out.println("Do pooja at home.");
		}
	}



	public void payBill(String payment){
		if(payment.equals("car")){
			System.out.println("Pay bill with credit card.");
		}

		else {
			System.out.println("Pay bill with cash.");
		}
	}

}