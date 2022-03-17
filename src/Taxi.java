public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        printCar();
        System.out.println("Total fare collected: " + fareCollected);
    }
}
