import java.util.ArrayList;

public class Lesson
{
  private String topic;
  private Resource[] resources;
  private Time start;
  private Time end;
  private Date date;
  public Lesson(String topic, Date date, Time start, Time end, Resource[] res){
    this.topic = topic;
    this.date =date;
    this.start = start;
    this.end = end;
    resources = res;
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date;
  }

  public Resource getResources()
  {
    return resources;
  }
  public ArrayList<Resource> getAllPDFs(){
    ArrayList<Resource> pdfResources = new ArrayList<>();

    for (Resource resource : resources) {
      if (resource.isPDF()) {
        pdfResources.add(resource);
      }
    }

    return pdfResources;
  }
  public Time getDuration(){
    return new Time(end.convertToSeconds() - start.convertToSeconds());
  }
  public static boolean hasValidTime(Time startTime, Time endTime){
    if(startTime.isBefore(new Time(8,20,0))){
      return false;
    }
    else if(endTime.isBefore(new Time(21,10,00))){
      return true;
    }
    else{
      return false;
    }
  }
  public String getDateTimeString(){
    return date + " " + start.toString() + "-" + end.toString();
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Lesson other = (Lesson) obj;
    return topic.equals(other.topic) && resources.equals(other.resources)
        && start.equals(other) && end.equals(other) && date.equals(date);
  }
  public String toString(){
    return topic + " " + resources + " " + getDateTimeString();
  }
}
