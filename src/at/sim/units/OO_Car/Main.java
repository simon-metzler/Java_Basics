package at.sim.units.OO_Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.tankVolume = 100;
        c1.fuelAmount = 20;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 6;
        c2.serialNumber = "B1234";
        c1.tankVolume = 50;
        c2.fuelAmount = 20;


        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        c1.turboBoost();

        c1.honk(10);

        c1.getRemainingRange();


    }
}
