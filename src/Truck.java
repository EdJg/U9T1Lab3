public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck()
  {
    printVehicle();
    System.out.println("Number of axles: " + axles + "\nHas trailer? " + hasTrailer);
  }

  public boolean validateLicensePlate()
  {
    boolean result = true;
    if (hasTrailer)
    {
      String stuff = getLicensePlate().substring(getLicensePlate().length() - 2, getLicensePlate().length() - 1);
      if (axles > 4)
      {
        result = stuff.equals("MX");
      }
      if (axles < 4)
      {
        result = stuff.equals("LX");
      }
      return false;
    }
    return result;
  }
}