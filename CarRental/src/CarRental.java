import java.util.ArrayList;

public class CarRental
{
  private String companyName;
  private String address;
  private ArrayList<Car> carsForRent;
  public CarRental(String companyName, String address){
    this.companyName = companyName;
    this.address = address;
    carsForRent = new ArrayList<Car>();
  }

  public String getCompanyName()
  {
    return companyName;
  }

  public String getAddress()
  {
    return address;
  }
  public int getNumberOfCars(){
    return carsForRent.size();
  }
  public Car getCar(int index){
    return carsForRent.get(index);
  }
  public void addCar(Car car){
    carsForRent.add(car);
  }
  public Car getCarByLicense(String licenseNo){
    int index = -1;
    for (int i = 0; i < carsForRent.size(); i++){
      if(carsForRent.get(i).getLicenseNo().equals(licenseNo)){
        index = i;
        break;
      }
    }
    return carsForRent.get(index);
  }
  public SportsCar getAvailableSportsCar(){
    int index = -1;
    for (int i = 0; i < carsForRent.size(); i++)
    {
      if(getCar(i).isAvailable() && getCar(i).getType().equals("SportsCar")){
        index = i;
        break;
      }
    }
    return (SportsCar) carsForRent.get(index);
  }
  public Van getAvailableVan(int capacity){
    int index = -1;
    for (int i = 0; i < carsForRent.size(); i++)
    {
      Car currentCar = getCar(i);

      if(currentCar.isAvailable() && currentCar instanceof Van){
        Van currentVan = (Van) currentCar;
        if (currentVan.getCapacity() >= capacity) {
          index = i;
          break;
        }
      }
    }
    return (Van) carsForRent.get(index);
  }

}
