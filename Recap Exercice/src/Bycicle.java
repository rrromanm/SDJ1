public class Bycicle extends Vehicle
{
  private int gears;
  public Bycicle(String color, int gears){
    super(color);
    this.gears = gears;
  }
  public int getGears(){
    return gears;
  }
  public void setGears(int gears){
    this.gears = gears;
  }
  public String toString(){
    return super.toString() + " " + gears;
  }

  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Bycicle other = (Bycicle) obj;
    return super.equals(other) && gears == other.gears;
  }

}
