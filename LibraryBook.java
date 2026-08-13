
public class LibraryBook {
	int bookId=101;
	String bookName="Java is Simple";
	String  author="Anirudh";
	int availableCopies=10;
	static String libraryName="VCube";
	String librarianName="Ameer";
	
	void displayBookDetails()
	{
		System.out.println("BookID:"+bookId);
		System.out.println("BookName:"+bookName);
		System.out.println("AuthorName"+author);
		System.out.println("Available Copies:"+availableCopies);
	}
    void displayLibraryDetails()
    {
    	String librarianName="Kittu";
    	System.out.println("Library Name:"+libraryName);
    	System.out.println("Libarian Name:"+librarianName);
    }
	
	public static void main(String[] args) {
		LibraryBook L1=new LibraryBook();
		
       L1.displayBookDetails();
       L1.displayLibraryDetails();
	}

}
