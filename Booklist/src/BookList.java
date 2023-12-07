import java.util.ArrayList;

public class BookList
{
  private ArrayList<Book> books;
  public BookList(){
    books = new ArrayList<>(1);
  }
  public int getNumberOfBooks(){
    return books.size();
  }
  public void addBook(Book book){
    books.add(book);
  }
  public Book getBook(int index){
    return books.get(index);
  }
  public Book getBook(String isbn){
    int index = -1;
    for (int i = 0; i < books.size(); i++){
      if(books.get(i).getIsbn().equals(isbn)){
        index = i;
        break;
      }
    }
    return books.get(index);
  }
  public void removeBook(int index){
    books.remove(index);
  }
  public int getIndexOfFirstPrintedBook(){
    int index = -1;
    for (int i = 0; i < books.size(); i++){
      Book currentBook = books.get(i);

      if(currentBook instanceof PrintedBook && ((PrintedBook) currentBook).isPaperback()){
        index = i;
        break;
      }
    }
    return index;
  }
  public int getNumberOfBooksByType(String type){
    int numberOfBooks = 0;
    for (int i = 0; i < books.size(); i++){
      if (books.get(i).getBookType().equals(type)){
        numberOfBooks++;
      }
    }
    return numberOfBooks;
  }
  public Book[] getBooksByType(String bookType){
    Book[] booksByType = new Book[100];
    for (int i = 0; i < books.size(); i++){
      if(books.get(i).getBookType().equals(bookType)){
        booksByType[i] = books.get(i);
      }
    }
    return booksByType;
  }
  public EBook[] getAllEBooks(){
    return (EBook[]) getBooksByType("E-book");
  }
  public String toString(){
    String returnStr = "";
    for (int i = 0; i < books.size(); i++){
      returnStr += books.get(i).toString() + "\n";
    }
    return returnStr;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    BookList other = (BookList) obj;
    return books.equals(other.books);
  }


}
