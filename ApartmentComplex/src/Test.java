public class Test
{
  public static void main(String[] args)
  {
    ApartmentComplex teknisk = new ApartmentComplex("Kollegievaenget");
    Room residence1 = new Room(321, 40);
    Room residence2 = new Room(310, 40);
    Apartment residence3 = new Apartment(200, 40, 3);
    Apartment residence4 = new Apartment(212, 40, 2);
    Room residence5 = new Room(102, 40);

    teknisk.add(residence1);
    teknisk.add(residence2);
    teknisk.add(residence3);
    teknisk.add(residence4);
    teknisk.add(residence5);

    residence1.rentTo(new Tenant("Romans"), new MyDate(1,9,2023));
    residence2.rentTo(new Tenant("Kristian"), new MyDate(1,2,2022));

    System.out.println(teknisk);
  }
}
