public class Car extends Vehicle
{
  private int topSpeed;
  private String regNo;
  public Car(String color, int topSpeed, String regNo){
    super(color);
    this.topSpeed = topSpeed;
    this.regNo = regNo;
  }
  public Car(String color, int topSpeed){
    super(color);
    this.topSpeed = topSpeed;
  }
  public int getTopSpeed(){
    return topSpeed;
  }
  public void setTopSpeed(int speed){
    this.topSpeed = speed;
  }
  public String getRegistrationNumber(){
    return regNo;
  }
  public void setRegistrationNumber(String regNo){
    this.regNo = regNo;
  }
  public String toString(){
    return super.toString() + " " + topSpeed + " " + regNo;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Car other = (Car) obj;
    return super.equals(other) && topSpeed == other.topSpeed && regNo.equals(other.regNo);
  }
}
