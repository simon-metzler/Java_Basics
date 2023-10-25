package at.sim.units.OO_Car;

public class Car {
    private String color;
    public int fuelAmount;
    public int fuelConsumption;
    public String serialNumber;
    public String brand;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }
}
