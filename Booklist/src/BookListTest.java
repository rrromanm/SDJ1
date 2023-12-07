import java.awt.print.Book;

public class BookListTest
{
  public static void main(String[] args)
  {
    BookList bookList = new BookList();
    PrintedBook book1 = new PrintedBook("Ultimos dias en Berlin", "731890487913", true);
    PrintedBook book2 = new PrintedBook("Atomic Habits", "107841371244", false);
    PrintedBook book3 = new PrintedBook("Shoe Dog", "079817487102", false);
    EBook book4 = new EBook("www.books.com", "The Self-Taught Programmer", "8904739294839");
    EBook book5 = new EBook("www.books.com", "The 48 laws of Power", "8473124801924");
    EBook book6 = new EBook("www.books.com", "Can't hurt me", "893394013105");

    bookList.addBook(book6);
    bookList.addBook(book3);
    bookList.addBook(book1);
    bookList.addBook(book4);
    bookList.addBook(book2);
    bookList.addBook(book5);

    System.out.println(bookList);
    System.out.println();
  }
}
