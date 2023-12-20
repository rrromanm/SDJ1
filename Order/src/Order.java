import java.util.ArrayList;

public class Order
{
  private int numberOfOrderLines;
  private ArrayList<OrderLine> orderLines;
  public Order(int numberOfOrderLines){
    this.numberOfOrderLines = numberOfOrderLines;
    orderLines = new ArrayList<>();
  }
  public void addOrderLine(Item item, int amount){
    if (orderLines.size() < numberOfOrderLines) {
      orderLines.add(new OrderLine(item, amount));
    } else {
      System.out.println("Maximum number of order lines reached. Cannot add more.");
    }
  }
  public int getNumberOfOrderLines(){
    return orderLines.size();
  }
  public double getTotalPrice(){
    double totalPrice = 0.00;
    for(int i = 0; i< orderLines.size(); i++){
      int totalAmount = orderLines.get(i).getAmount();
      totalPrice += totalAmount*orderLines.get(i).getItem().getPrice();
    }
    return totalPrice;
  }

  public Item getOrderItem(int orderLineIndex){
    return orderLines.get(orderLineIndex).getItem();
  }
  public int getAmountOfOrderItem(int orderLineIndex){
    return orderLines.get(orderLineIndex).getAmount();
  }
  public double getTotalWeightForWeightedItems(){
    double totalWeight = 0;
    for (int i = 0; i < orderLines.size(); i++){
      if(orderLines.get(i).getItem() instanceof WeighedItem){
        WeighedItem currentItem  = (WeighedItem) orderLines.get(i).getItem();
        totalWeight += currentItem.getWeight();
      }
    }
    return totalWeight;
  }
  public String toString(){
    String returnStr = "";
    for (int i = 0; i < orderLines.size(); i++){
      if(orderLines.get(i) != null)
      {
        returnStr += orderLines.get(i).toString() + "\n";
      }
    }
    return returnStr;
  }
}
