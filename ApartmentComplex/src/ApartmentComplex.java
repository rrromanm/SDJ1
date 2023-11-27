import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Residence> residences;
  public ApartmentComplex(String address){
    this.address = address;
    residences = new ArrayList<Residence>();
  }
  public int getNumberOfResidences(){
    return residences.size();
  }
  public void add(Residence residence){
    residences.add(residence);
  }
  public Residence getResidence(int index){
    return residences.get(index);
  }
  public Residence getResidenceByNumber(int number){
    Residence temp = null;
    for(int i = 0; i< residences.size(); i++){
      Residence currentResidence = residences.get(i);
      if(currentResidence != null && currentResidence.getNumber() == number){
        temp = currentResidence;
        break;
      }
    }
    return temp;
  }
  public Room getFirstAvailableRoom(){
    Room temp = null;
    for(int i = 0; i<residences.size(); i++){
      Room currentResidence = (Room) residences.get(i);
      if (residences.get(i).isAvailable() && residences.get(i).getNumberOfRooms()>1){
        temp = currentResidence;
        break;
      }
    }
    return temp;
  }

  public String toString(){
    String returnStr = "";
    for(int i = 0; i<residences.size(); i++){
      if(residences.get(i) != null){
        returnStr+=residences.get(i).toString();
      }
    }
    return returnStr;
  }
}
