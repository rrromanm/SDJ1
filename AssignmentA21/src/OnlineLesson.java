public abstract class OnlineLesson extends Lesson
{
  public boolean cameraRequired;
  public OnlineLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera){
    super(topic, date, start, end, res);
    cameraRequired = camera;
  }
  public boolean isCameraRequired(){
    return cameraRequired;
  }
  public abstract String nameOfSoftware();
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    OnlineLesson other = (OnlineLesson) obj;
    return super.equals(other) && cameraRequired == other.cameraRequired;
  }
  public String toString(){
    return super.toString() + " " + cameraRequired;
  }
}
