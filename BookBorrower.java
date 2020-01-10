public class BookBorrower{
	private String nameOfBookBorrower;
	private String nameOfPenBorrower;

	public String getNameOfBookBorrower(){
		return nameOfBookBorrower;
	}

	public String getNameOfPenBorrower(){
		return nameOfPenBorrower;
	}

	public void setNameOfBookBorrower( String nameBorrowedBook){
		nameOfBookBorrower = nameBorrowedBook;
	}

	public void setNameOfPenBorrower(String nameBorrowedPen){
		nameOfPenBorrower = nameBorrowedPen; 
	}
}