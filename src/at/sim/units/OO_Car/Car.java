package at.sim.units.OO_Car;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Wheel> wheels;
    private String color;
    private int fuelAmount;
    public int fuelConsumption;

    private int tankVolume;
    private String serialNumber;
    private String brand;

    public Car(String serialNumber, int fuelConsumption, int tankVolume, Engine engine){
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.tankVolume = tankVolume;
        this.engine = engine;
        this.mirrors = new ArrayList<>();
        this.wheels = new ArrayList<>();
    }

    public void addWheel(Wheel wheel){
        this.wheels.add(wheel);
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void drive(int speed){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Car is driving");
        engine.drive(speed);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

