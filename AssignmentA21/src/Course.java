import java.util.ArrayList;

public class Course
{
  private String name;
  private ArrayList<Lesson> schedule;
  public Course(String name){
    this.name = name;
    schedule = new ArrayList<Lesson>();
  }

  public String getName()
  {
    return name;
  }
  public int getNumberOfLessons(){
    return schedule.size();
  }
  public void addLesson(Lesson lesson){
    schedule.add(lesson);
  }
  public void removeLesson(Lesson lesson){
    schedule.remove(lesson);
  }
  public boolean hasLessonOnDate(Date date){
    if(schedule.contains(date)){
      return true;
    }
    return false;
  }
  public ArrayList<Lesson> getAllLessons(){
    return schedule;
  }
  public ArrayList<String> getAllTopics(){
    ArrayList<String> allTopics = new ArrayList<String>();
    for (int i = 0; i < schedule.size(); i++)
    {
      allTopics.add(schedule.get(i).getTopic());
    }
    return allTopics;
  }
  public ArrayList<OnlineLesson> getOnlineLessons(){
    ArrayList<OnlineLesson> online = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      Lesson currentLesson = schedule.get(i);
      if(schedule.get(i) instanceof OnlineLesson){
        online.add((OnlineLesson) currentLesson);
      }
    }
    return online;
  }
  
}
