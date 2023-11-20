public abstract class Vehicle
{
  private String color;
  private MyDate purchaseDate;
  public Vehicle(String color){
    this.color = color;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }
  public MyDate getPurchaseDate(){
    return purchaseDate;
  }
  public void setPurchaseDate(MyDate purchaseDate){
    this.purchaseDate = purchaseDate;
  }
  public String toString(){
    return color;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Vehicle other = (Vehicle) obj;
    return color.equals(other.color);
  }

}
