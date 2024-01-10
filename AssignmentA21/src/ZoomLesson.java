public class ZoomLesson extends OnlineLesson
{
  private String link;
  private boolean breakoutRooms;
  public ZoomLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera, String link, boolean breakout){
    super(topic, date, start, end, res, camera);
    this.link = link;
    breakoutRooms = breakout;
  }

  public String getLink()
  {
    return link;
  }
  public boolean usesBreakoutRooms(){
    return breakoutRooms;
  }
  public String nameOfSoftware(){
    return "Zoom";
  }
}
