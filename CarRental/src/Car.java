public abstract class Car
{
  private String licenseNo;
  private double price;
  private Customer rentedTo;
  public Car(String licenseNo, double price){
    this.licenseNo = licenseNo;
    this.price = price;
    rentedTo = null;
  }
  public String getLicenseNo(){
    return licenseNo;
  }
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public abstract String getType();
  public Customer getRentedTo(){
    return rentedTo;
  }
  public void setRentedTo(Customer customer){
    rentedTo = new Customer(customer.getName(), customer.getAddress());
  }
  public boolean isAvailable(){
    if(rentedTo == null){
      return true;
    }
    return false;
  }
}
