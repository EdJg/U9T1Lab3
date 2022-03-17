public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  public void printCar()
  {
    printVehicle();
    System.out.println("Electric? " + electric + "\nDiscount applied: " + discountApplied);
  }

  public boolean dropOffPassengers(int numOut)
  {
    if (numOut < getPassengers())
    {
      dropPassengers(numOut);
      return true;
    }
    return false;
  }

  public void applyDiscount()
  {
    if (!discountApplied && electric)
    {
      tollDiscount();
      discountApplied = true;
    }
  }
}