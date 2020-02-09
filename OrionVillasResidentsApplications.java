import java.util.Scanner;

public class OrionVillasResidentsApplications{
	static String clubHouseName = "Orion Villa's ClubHouse"; 

	public static void main(String[] args){

		Scanner detail = new Scanner(System.in);

		System.out.println("Enter your name");
		String detail1 = detail.nextLine();

		System.out.println("Enter your villa number ");
		String detail2 = detail.nextLine(); 

		System.out.println("The name of the clubhouse you use is " + clubHouseName);

		System.out.println("You are " +detail1);
		System.out.println("You belong to villa number " +detail2);
	}
}