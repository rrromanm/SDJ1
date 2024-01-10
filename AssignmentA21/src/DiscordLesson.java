public class DiscordLesson extends OnlineLesson
{
  private String channelName;
  public DiscordLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera, String channel){
    super(topic, date, start, end, res, camera);
    channelName = channel;
  }

  public String getChannelName()
  {
    return channelName;
  }
  public String nameOfSoftware(){
    return "Discord";
  }
}
