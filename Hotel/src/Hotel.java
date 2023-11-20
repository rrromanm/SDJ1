import java.util.ArrayList;

public class Hotel
{
  private String name;
  private String address;
  private Room[] rooms;
  private ArrayList<Employee> employees;
  public Hotel(String name, String address, Room[] rooms){
    this.name = name;
    this.address = address;
    this.rooms = rooms;
  }

  public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public Room getRoom(int roomNumber){
    return rooms[roomNumber];
  }
  public void hireReceptionist(int number, String name){
    employees.add(new Receptionist(number, name));
  }

  public void hireCleaningPerson(int number, String name){
    employees.add(new CleaningPerson(number, name));
  }

  public void fireEmployee(int number){
    if(employees.contains(number)){
      employees.remove(number);
    }
  }
  public CleaningPerson getCleaningPersonForRoom(int roomNumber){
  }

}
