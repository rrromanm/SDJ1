public class PriviligedCustomer extends Customer
{
  private double discount;
  public PriviligedCustomer(String name, double discount){
    super(name);
    this.discount = discount;
  }
  public double getDiscount(){
    return discount;
  }
  public void setDiscount(double percentage){
    this.discount = percentage;
  }
}
