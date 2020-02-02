import java.util.Scanner; 

public class AddBinaryNumbers{

	public static void main(String[] args){

		Scanner num = new Scanner(System.in);

		System.out.println("Enter two binary numbers (1 or 0) to add:");
		int num1 = num.nextInt();
		int num2 = num.nextInt();

		int anArray[] = {num1,num2};

		AddBinaryNumbers x = new AddBinaryNumbers();
		int addGivenVal = x.addGivenVal(anArray);

		System.out.println("The sum of the two entered binary numbers is: " +addGivenVal);

		}

	public int addGivenVal(int[] myVal){
		int binaryVal = 0;

	
			if(myVal[0]==0 && myVal[1]==0){
				binaryVal = 0;
			}

			if(myVal[0]==0 && myVal[1]==1){
				binaryVal = 1;
			}

			if(myVal[0]==1 && myVal[1]==0){
				binaryVal = 1;
			}

			if(myVal[0]==1 && myVal[1]==1){
				binaryVal = 10;
			}


		return binaryVal;
		
		
	}

}
