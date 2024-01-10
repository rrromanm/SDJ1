public class Time
{
  private int hour;
  private int minute;
  private int second;
  public Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  public Time(int totalTimeInSeconds){
    hour = totalTimeInSeconds / 3600;
    minute = (totalTimeInSeconds % 3600) / 60;
    second = totalTimeInSeconds % 60;
  }
  public int convertToSeconds(){
    int totalSeconds = 0;

    totalSeconds += hour*3600;
    totalSeconds += minute*60;
    totalSeconds += second;

    return totalSeconds;
  }
  public boolean isBefore (Time time2){
    if(this.convertToSeconds() > time2.convertToSeconds()){
      return true;
    }
    return false;
  }

  public Time timeUntil(Time time2){
    int secondsLeft = time2.convertToSeconds() - this.convertToSeconds();
    return new Time(secondsLeft);
  }
  public Time copy(){
    return new Time(this.hour, this.minute, this.second);
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Time other = (Time) obj;
    return hour == other.hour && minute == other.minute && second == other.second;
  }
  public String toString(){
    return hour + ":" + minute + ":" + second;
  }
}
