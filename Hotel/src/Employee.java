public abstract class Employee
{
  private int number;
  private String name;
  public Employee(int number, String name){
    this.number = number;
    this.name = name;
  }
  public int getNumber(){
    return number;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
}
