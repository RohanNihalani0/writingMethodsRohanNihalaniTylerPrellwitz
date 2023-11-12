/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);
    System.out.println("Library: \n" + myLib);
    myLib.addBook(myBook);
    System.out.println("Library: \n" + myLib);
    int myRating = 1;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    myBook.setTitle("The Hobbit");
    System.out.println("Book: " + myBook);
    System.out.println("Libary: " + myLib);


    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    // newBook = new Book("1984", "Orwell");
    // System.out.println(myLib2);

    // System.out.println("before test:" + newBook);
    // myLib.testBook(newBook);
    // System.out.println("after test:" + newBook);
    Book newBook2 = new Book("To Kill a Mockingbird", "Lee");
    System.out.println(newBook.equals(newBook2));
    newBook2.setTitle("Hunger Games");
    newBook2.setAuthor("Lee");
    System.out.println(newBook.equals(newBook2));

    Movie newMovie = new Movie("Transformers", 2.0);
    System.out.println(newMovie.toString());
    Movie newMovie2 = new Movie("Transformers", 2.0);
    System.out.println(newMovie.equals(newMovie2));
    newMovie2.setTitle("Hunger Games");
    newMovie2.setDuration(3.0);
    System.out.println(newMovie.equals(newMovie2));

  }
}