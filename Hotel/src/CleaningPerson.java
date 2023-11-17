import java.util.ArrayList;

public class CleaningPerson extends Employee
{
  private ArrayList<Room> rooms;
  public CleaningPerson(int number, String name){
    super(number, name);
    rooms = new ArrayList<Room>();
  }

  public void addRoom(Room room){
    rooms.add(room);
  }
  public void removeRoom(Room room){
    rooms.remove(room);
  }
  public boolean cleansRoom(int roomNumber){
    if(rooms.contains(roomNumber)){
      return true;
    }
    return false;
  }
}
