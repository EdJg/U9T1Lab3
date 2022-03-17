public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }
  
  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  public String getLicensePlate()
  {
    return licensePlate;
  }

  public double getTollFee()
  {
    return tollFee;
  }

  public void tollDiscount()
  {
    tollFee /= 2;
  }

  public int getPassengers()
  {
    return passengers;
  }

  public void dropPassengers(int dropped)
  {
    passengers -= dropped;
  }


  public void printVehicle()
  {
    System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers());
  }
}