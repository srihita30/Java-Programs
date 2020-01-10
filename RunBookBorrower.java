public class RunBookBorrower{
	public static void main(String args[]){
		BookBorrower name = new BookBorrower();
		name.setNameOfBookBorrower("Srihita");
		name.setNameOfPenBorrower("Ranji");

		System.out.println("The name of the peron who borrowed the book is " + name.getNameOfBookBorrower() + " and the name of the person who borrowed the pen is " + name.getNameOfPenBorrower() + ".");
	}
}