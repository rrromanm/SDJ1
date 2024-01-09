import java.util.ArrayList;

public class Pizza
{
  private String name;
  private double initialPrice;
  private int numberOfToppings;
  private ArrayList<Topping> toppings;
  private final int MAX_NUMBER_OF_TOPPINGS = 5;
  public Pizza(String name, double initialPrice){
    this.name = name;
    this.initialPrice = initialPrice;
    toppings = new ArrayList<Topping>();
  }
  public int getNumberOfToppings(){
    return toppings.size();
  }
  public void addTopping(Topping topping){
    if(toppings.size() < MAX_NUMBER_OF_TOPPINGS){
      toppings.add(topping);
    }
  }
  public void removeTopping(String toppingName)
  {
    for (int i = 0; i < toppings.size(); i++)
    {
      if (toppings.get(i).getName().equals(toppingName))
      {
        toppings.remove(i);
        break;
      }
    }
  }
    public double getTotalPrice()
    {
      double totalPrice = initialPrice;
      for (int i = 0; i < toppings.size(); i++){
        totalPrice += toppings.get(i).getPrice();
      }
      return totalPrice;
    }

  public String getName()
  {
    return name;
  }
}
