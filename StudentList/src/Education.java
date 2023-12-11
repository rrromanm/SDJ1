public abstract class Education
{
  private String code;
  private String title;
  public Education(String code, String title){
    this.title = title;
    this.code = code;
  }
  public String getCode(){
    return code;
  }
  public String getTitle(){
    return title;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Education other = (Education) obj;
    return code.equals(other.code) && title.equals(other.title);
  }
  public String toString(){
    return code + " " + title;
  }
}
