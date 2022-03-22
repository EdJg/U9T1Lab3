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
    if (hasTrailer)
    {
      String stuff = getLicensePlate().substring(getLicensePlate().length() - 2, getLicensePlate().length());
      if (axles > 4)
      {
        return stuff.equals("MX");
      }
      if (axles < 4)
      {
        return stuff.equals("LX");
      }
    }
    return true;
  }

  @Override
  public double calculateTollPrice()
  {
    if (hasTrailer)
    {
      return 2 * getTollFee() * axles;
    }
    return getTollFee() * axles;
  }
}