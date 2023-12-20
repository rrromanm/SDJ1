public class OrderLine
{
  private int amount;
  private Item item;
  public OrderLine(Item item, int amount){
    this.amount = amount;
    this.item = item;
  }

  public Item getItem()
  {
    return item;
  }

  public int getAmount()
  {
    return amount;
  }

  public void setAmount(int amount)
  {
    this.amount = amount;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    OrderLine other = (OrderLine) obj;
    return amount == other.amount && item.equals(other.item);
  }
  @Override public java.lang.String toString()
  {
    return "Amount: " + amount + " of " + item.getInfo();
  }
}
