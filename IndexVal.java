import java.util.Scanner; 

public class IndexVal{
	
//Index value finder

	public static void main(String[] args) {


		Scanner obj = new Scanner(System.in);

		System.out.println("This will print the index values");

		int a[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		IndexVal x = new IndexVal(); 

		int theIndexVal = x.findTheVal(a);	
		System.out.println("The index value of 25 is : " + theIndexVal);
}

	public static int findTheVal(int[] myArray)
	{
		int ind = 0;

		int indexVal = myArray[0];

			for(int i=0; i<myArray.length; i++) {
			if (myArray[i]==25){
			ind = i;
			}
		}
	return ind;
}
}