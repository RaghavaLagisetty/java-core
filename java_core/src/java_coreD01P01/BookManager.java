package java_coreD01P01;

public class BookManager{
	public static Book createBook(String title,double price) {
		Book book=new Book();
		book.setBookTitle(title);
		book.setBookPrice(price);
		return book;
	}
	public static void showBook(Book book) {
    System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
}
	public static void main(String[] args) {
		Book myBook= createBook("Java Programming",350.00);
		showBook(myBook);
	}
}

	
	
//public class BookManager {
//    public static Book createBook(String title, double price) {
//        Book book = new Book();
//        book.setBookTitle(title);
//        book.setBookPrice(price);
//        return book;
//    }
//
//    
//
//    public static void main(String[] args) {
//        // Create a book
//        Book myBook = createBook("Java Programming", 350.00);
//        
//        // Show the book details
//        showBook(myBook);
//    }
//}

