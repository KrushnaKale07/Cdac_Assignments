/*20. Library System
Create two classes:
Class 1: Book
● bookId, bookName
Class 2: Library
● Method to display books
Requirements:
● Create multiple books
● Pass objects to library
● Display all books*/

class Book{

	int bookId;
    String bookName;

    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class Library{
	void displayBooks(Book[] books) {
        System.out.println("---- Library Books ----");

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book ID   : " + books[i].bookId);
            System.out.println("Book Name : " + books[i].bookName);
            System.out.println("-----------------------");
        }
    }
}

public class LibrarySystemMain {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming");
        Book b2 = new Book(102, "Data Structures");
        Book b3 = new Book(103, "Operating Systems");

        Book[] books = {b1, b2, b3};

        Library lib = new Library();

        lib.displayBooks(books);
    }
	
}