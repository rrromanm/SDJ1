import java.time.LocalDate;
public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public boolean isBefore(Date date2){
    if (this.year < date2.year) {
      return true;
    } else if (this.year == date2.year && this.month < date2.month) {
      return true;
    } else if (this.year == date2.year && this.month == date2.month && this.day < date2.day) {
      return true;
    }
    return false;
  }

  private boolean isLeapYear(){
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }
  private int daysInMonth(){
    switch (month) {
      case 1: // January
      case 3: // March
      case 5: // May
      case 7: // July
      case 8: // August
      case 10: // October
      case 12: // December
        return 31;
      case 4: // April
      case 6: // June
      case 9: // September
      case 11: // November
        return 30;
      case 2: // February
        return isLeapYear() ? 29 : 28; // Leap year has 29 days in February
      default:
        return 0; // Invalid month
    }
  }
  private void nextDay(){
    int maxDaysInMonth = daysInMonth();

    if (day < maxDaysInMonth) {
      day++;
    } else {
      day = 1;
      if (month < 12) {
        month++;
      } else {
        month = 1;
        year++;
      }
    }
  }
  public static Date today(){
    LocalDate currentDate = LocalDate.now();
    return new Date(currentDate.getDayOfMonth(), currentDate.getMonthValue(), currentDate.getYear());
  }
  public Date copy(){
    return new Date(this.day, this.month, this.year);
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Date other = (Date) obj;
    return day == other.day && month == other.month && year == other.year;
  }
  public String toString(){
    return day + "/" + month + "/" + year;
  }
}
