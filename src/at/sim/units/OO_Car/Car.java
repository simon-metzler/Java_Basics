package at.sim.units.OO_Car;

public class Car {
    private String color;
    public int fuelAmount;
    public int fuelConsumption;

    public int tankVolume;
    public String serialNumber;
    public String brand;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void brake() {
        System.out.println("Ich bremse!");
    }

    public void turboBoost() {
        if ((fuelAmount/tankVolume)>0.1) {
            System.out.println("Super boost");
        } else {
            System.out.println("Not enough fuel");
        }

    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++){
            System.out.println("Tuuuut");
        }
    }

    public void getRemainingRange() {
        float remainingRange = (float) fuelAmount / fuelConsumption;
        System.out.println("Remaining range: " + remainingRange);
    }
}
