/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\"," + duration + " hours long";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }
  
  public void adjustRating(int value) {
    if((rating + value) <= 10 && (rating + value) >= 0) {
      rating += value;
    }
  }

   public boolean equals(Movie m) {
    if(this.title.equals(m.title) && this.duration == m.duration) {
      return true;
    } else {
      return false;
    }
  }

}
