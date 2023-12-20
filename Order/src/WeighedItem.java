public class WeighedItem extends Item
{
  private double weight;
  public WeighedItem(String name, double price, double weight){
    super(name, price);
    this.weight = weight;
  }

  public double getWeight()
  {
    return weight;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    WeighedItem other = (WeighedItem) obj;
    return super.equals(other) && weight == other.weight;
  }
  public String getInfo(){
    return "Weighted Item: " + weight + " kg";
  }
}
