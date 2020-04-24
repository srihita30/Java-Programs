import java.util.Scanner;

public class NameFinder{

	public static void main(String[] args){

		Scanner person = new Scanner(System.in);


			System.out.println("Enter the total number of people you want to compare: ");

			int totalPersons = person.nextInt(); 
			//--eat the line


			Characteristics[] theArray = new Characteristics[totalPersons];

			int i = 0;

			while (i < theArray.length){

				person.nextLine();//this is added to eat new line.
				System.out.println("Enter the Name: ");

				String name = person.nextLine();


				System.out.println("Enter the age: ");

				int age = person.nextInt();

				System.out.println("Enter the weight: "); 

				int weight = person.nextInt();

			


				Characteristics thePerson = new Characteristics();
				thePerson.setNameOfPerson(name);
				thePerson.setTheAge(age);
				thePerson.setWeight(weight);

	  				theArray[i] = thePerson; 

	  				i = i + 1; 
				}

				NameFinder theName = new NameFinder();

				theName.theAgeAndWeight(theArray);


			}


			public void theAgeAndWeight(Characteristics[] anArray){

				Characteristics max = new Characteristics();

				int i = 0;

				max = anArray[i];

				while(i<anArray.length){

					if(max.getTheAge() < anArray[i].getTheAge()){
						max = anArray [i]; 
					}

					i = i + 1; 
				}

				Characteristics least = new Characteristics();

				int x = anArray.length - 1;

				least = anArray[x];

				for(x=anArray.length - 1; x>=0; x--){

					if(least.getWeight() > anArray[x].getWeight()){
						least = anArray [x]; 
					}
				}

				System.out.println("The oldest person is: " + max.getNameOfPerson() + " and thier age is: " + max.getTheAge());
				System.out.println("The person with the least weight is: " + least.getNameOfPerson() + " and their weight is: " + least.getWeight());
			}


}