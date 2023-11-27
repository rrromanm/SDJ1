import java.util.ArrayList;

public class Person
{
  private String name;
  private String address;
  private MyDate birthday;
  private ArrayList<Vehicle> vehicles;
  public Person (String name, String address, MyDate birthday){
    this.name = name;
    this.address = address;
    this.birthday = birthday;
    vehicles = new ArrayList<Vehicle>();
  }
  public Person (String name, MyDate birthday){
    this.name = name;
    this.address = "No address";
    this.birthday = birthday;
    vehicles = new ArrayList<Vehicle>();
  }
  public Person(MyDate birthday){
    this.name = "No name";
    this.address = "No address";
    this.birthday = birthday;
    vehicles = new ArrayList<Vehicle>();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public void addVehicle(Vehicle vehicle){
    vehicles.add(vehicle);
  }
  public Vehicle[] getAllVehicle(){
    return vehicles.toArray(new Vehicle[vehicles.size()]);
  }
//  public Car[] getAllCars(){
//    ArrayList<Car> cars = new ArrayList<Car>();
//    for(int i = 0; i < vehicles.size(); i++){
//      if(vehicles.get(i) instanceof Car){
//        if(((Car) vehicles.get(i)).getTopSpeed() > topS)
//       }
//    }
//  }
}
