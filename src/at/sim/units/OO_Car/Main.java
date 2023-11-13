package at.sim.units.OO_Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(7, "Audi", "A1234");
        c1.setTankVolume(100);
        c1.setFuelAmount(10);

        Car c2 = new Car(6, "BMW", "B1234");
        c1.setTankVolume(50);
        c2.setTankVolume(20);

        Car c3 = new Car(17, "Opel", "1234O");

        System.out.println(c1.getBrand());



    }
}
