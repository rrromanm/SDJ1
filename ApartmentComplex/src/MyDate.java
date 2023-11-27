import java.util.Date;
public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public int getDay(){
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }
  public void set(int day, int year, int month)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public MyDate copy(){
    return new MyDate(day, month, year);
  }
  public String toString(){
    return day + "/" + month + "/" + year;
  }
}
