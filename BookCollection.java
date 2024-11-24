//1. Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object.
// Create an ArrayList of type Book and store all book objects into collections and display all book details.
//[Hint:Use advanced for loop to display all Books details]

import java.util.ArrayList;
class Book {
	int BookId;
	String BookName;
	String BookAuthor;
	public Book(int BookId, String BookName, String BookAuthor) {
		this.BookId = bookId;
		this.BookName = bookName;
		this.BookAuthor = bookAuthor;
	}
	public void displayBookDetails() {
		System.out.println("BookId: " + bookId ", BookName: " + bookName ", BookAuthor: " + bookAuthor);
	}

    public class BookCollection {
	    public static void main(String[] args) {
		     ArrayList<Book> bookList = new ArrayList<>();
		
		    bookList.add(new Book(121, "My Demon", "Kim Janghan"));
		    bookList.add(new Book(122, "Hwarang", "Yoon Sungsik"));
		    bookList.add(new Book(123, "My Girlfriend is an Alien", "Deng ke gao Zong kai"));
		    bookList.add(new Book(124, "Water god", "Kim Byung-soo"));
	        bookList.add(new Book(125, "Tale of nine tailed", "Kang Shin-hyo"));
		}
	        
	    System.out.println("Displaying all book details: ");
	    for (Book Book : bookList) {
		    book.displayBookDetails();
	    }
    }
}


	
		
