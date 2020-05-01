import java.util.Scanner; 
/****
 * 
 * @author hitu
 *
 */
public class AddBinary{

	public static void main(String[] args){

		Scanner num = new Scanner(System.in);

		System.out.println("Enter two binary numbers (1 or 0) to add:");
		int num1 = num.nextInt();
		int num2 = num.nextInt();


		AddBinary x = new AddBinary();
		int addGivenVal = x.addGivenVal(num1, num2);

		System.out.println("The sum of the two entered binary numbers is: " +addGivenVal);

		}

	public int addGivenVal(int myVal, int nextVal){
		int binaryVal = 0;

	
			if(myVal==0 && nextVal==0){
				binaryVal = 0;
			}

			if(myVal==0 && nextVal==1){
				binaryVal = 1;
			}

			if(myVal==1 && nextVal==0){
				binaryVal = 1;
			}

			if(myVal==1 && nextVal==1){
				binaryVal = 10;
			}


		return binaryVal;
		
		
	}

}
