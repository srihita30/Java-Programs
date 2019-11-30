import java.util.Scanner; 

public class MinAndMaxOfArray{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
			System.out.println("Enter the 7 Values:");

			int num1 = num.nextInt();
			int num2 = num.nextInt();
			int num3 = num.nextInt();
			int num4 = num.nextInt();
			int num5 = num.nextInt();
			int num6 = num.nextInt();
			int num7 = num.nextInt(); 

			int theArray[] = {num1, num2, num3, num4, num5, num6, num7};

			MinAndMaxOfArray arrayVal = new MinAndMaxOfArray(); 
			int minVal = arrayVal.findTheMin(theArray);
			int maxVal = arrayVal.findTheMax(theArray);

			System.out.println("The Min Value Of the Array is: " + minVal );
			System.out.println("The Min Value Of the Array is: " + maxVal );
	}

	public int findTheMin(int[] firstArray){
	
		int min = firstArray[0];
		for(int i = 0; i < firstArray.length; i++){
			if (firstArray[i]<min) { 
				min = firstArray[i];
			} 
		} 

		return min;
 }
		
	public int findTheMax(int[] secondArray){

		int max = secondArray[0];
		for(int i = 0; i < secondArray.length; i++){
			if (secondArray[i]>max) { 
				max = secondArray[i];
			} 
		} 

		return max; 
	}        

}