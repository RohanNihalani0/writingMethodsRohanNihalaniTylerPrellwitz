/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    String info = "";
    if(!(book == null)) {
      info += book.getTitle();
    }
    
    
    
    return info;
  }
}