public class Programme extends Education
{
  private String level;
  public Programme(String code, String title, String level){
    super(code, title);
    this.level = level;
  }
  public String getLevel(){
    return level;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Programme other = (Programme) obj;
    return super.equals(other) && level.equals(other.level);
  }
  public String toString(){
    return super.toString() + " " + level;
  }
}
