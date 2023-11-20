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
  public MyDate(MyDate obj){
    this.day = obj.day;
    this.month = obj.month;
    this.year = obj.year;
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

//  public boolean isBefore(MyDate other){
//
//  }

  public String toString(){
    return day + "/" + month + "/" + year;
  }
  public MyDate copy(){
    return new MyDate(day, month, year);
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    MyDate other = (MyDate) obj;
    return day == other.day && month == other.month && year == other.year;
  }
}
