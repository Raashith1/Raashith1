package oops;

public class BookDemo {
	public static void main(String[] args) {
		
		Book gameOfThrones = new Book("George Martwin","Game Of Thrones","Fantasy",875);
		
		Book mathBook = new Book("John Matthews","Calculus","Math",1075);
		
		Book javaBook = new Book("Joel Murach","Murach's Java Programming","Programming",500);
		
		printBookDetails(gameOfThrones);
		printBookDetails(mathBook);
		printBookDetails(javaBook);
		}
		
	public static void printBookDetails(Book book) {
		System.out.println(book.getTitle());
		System.out.println("by "+book.getAuthor());
		System.out.println("has "+book.getNumPages()+" pages and genre is "+book.getGenre());
		
		System.out.println();
	}

}
