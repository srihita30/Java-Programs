//This code will find the highest age and the least age, as the user enters a set of values as ages and weights. 

import java.util.Scanner;

public class MaxAndMinFinder{

	public static void main(String[] args){

		Scanner person = new Scanner(System.in);


			System.out.println("Enter the total number of people you want to compare: ");

			int totalPersons = person.nextInt(); 

			//Array of type characterstics.

			Characteristics[] theArray = new Characteristics[totalPersons];

			int i = 0;

			while (i < theArray.length){

				System.out.println("Enter the age: ");

				int age = person.nextInt();

				System.out.println("Enter the weight: "); 

				int weight = person.nextInt();
				
				//Age and wieght are being set ans sent into the array. 

				Characteristics thePerson = new Characteristics();
				thePerson.setTheAge(age);
				thePerson.setWeight(weight);

	  				theArray[i] = thePerson; 

	  				i = i + 1; 
				}

				MaxAndMinFinder theMinMax = new MaxAndMinFinder();

				theMinMax.theAgeAndWeight(theArray);


			}

			//Method to find the highest and lowest age. 

			public void theAgeAndWeight(Characteristics[] anArray){

				//Object named max, to call the characterstics in the previous class and use them for comparision. 

				Characteristics max = new Characteristics();

				int i = 0;

				max = anArray[i];

				//Loop to calculate the highest age. 

				while(i<anArray.length){

					if(max.getTheAge() < anArray[i].getTheAge()){
						max = anArray [i]; 
					}

					i = i + 1; 
				}

				//Object named least, to call the characterstics in the previous class and use them for comparision. 				

				Characteristics least = new Characteristics();

				int x = anArray.length - 1;

				least = anArray[x];

				//Loop to calculate the least weight. 

				for(x=anArray.length - 1; x>=0; x--){

					if(least.getWeight() > anArray[x].getWeight()){
						least = anArray [x]; 
					}
				}

				//Highest age is printed. 
				System.out.println("The oldest person is " + max.getTheAge() + " years");

				//Lowest weight is printed. 
				System.out.println("The person with the least weight is: " + least.getWeight() + " kgs");
			}


}