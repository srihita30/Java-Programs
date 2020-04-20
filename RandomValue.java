import java.util.Random;

/*
*There are 3 boys Ram, bheem and lakshman. All of them are to be always almost equally treated, based on amount of cumulative award they are given.
*We need a program to give award 50 times, based on random draw. The draw determines the award value.
*This award is then allocated to one of them.
*While allocating the award you need to ensure its given to the person who deserves it most, based on equal treatment
*/
public class RandomValue{

	public static void main(String[] args){

			RandomValue theRandomVal = new RandomValue(); 

			 theRandomVal.theValueCounter(); 

	}

	//This method will add the random values to each of the boys and will ensure all are equal in the end. 

	public void theValueCounter() {

		Random random = new Random();  

		//An array for the objects.

		Participant[] pArray = new Participant[3];

		//Objects for each participants. 

		Participant ram = new Participant();

		ram.setTheValue(0); 
		ram.setNameOfGuy("ram");

		Participant bheem = new Participant();

		bheem.setTheValue(0); 
		bheem.setNameOfGuy("bheem");

		Participant lakshman = new Participant();

		lakshman.setTheValue(0); 
		lakshman.setNameOfGuy("lakshman");

		pArray[0] = ram;

		pArray[1] = bheem;

		pArray[2] = lakshman; 

		Random randomVal = new Random();

		Participant least = new Participant();

		least = ram; //Assumption for the beginning 

		//logic for calcualting the toatal sum of the random values for each participant. 

		for(int x = 0; x<50; x++){
			int randomValue = randomVal.nextInt(10);

			for(int z = 0; z<pArray.length; z++){
				if(least.getTheValue() > pArray[z].getTheValue()){
					least = pArray[z];
				}
			}

			least.setTheValue(least.getTheValue() + randomValue);
		}

		System.out.println(pArray[0].getNameOfGuy() + " has " + pArray[0].getTheValue()); 
		System.out.println(pArray[1].getNameOfGuy() + " has " + pArray[1].getTheValue()); 
		System.out.println(pArray[2].getNameOfGuy() + " has " + pArray[2].getTheValue()); 
	}
	
}