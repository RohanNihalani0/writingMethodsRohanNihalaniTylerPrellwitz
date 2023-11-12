/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  // public void testbook(Book tester) {
  //   tester.setTitle("new title");
  //   System.out.println("the title was changed to " + tester.getTitle());
  // }

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

 

  public String toString() 
  {
    String info = "";
    if(!(book == null)) {
      info += book.getTitle() + "\"";
    }
    if(!(movie == null)) {
      info += movie.getTitle();
    }
    
    
    
    return info;
  }
}