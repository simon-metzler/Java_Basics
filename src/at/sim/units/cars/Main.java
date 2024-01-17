package at.sim.units.cars;

public class Main {
    public static void main(String[] args) {


        Producer p1 = new Producer("McLaren", "UK", 0.3);
        Engine e1 = new Engine(Engine.TYPE.DIESEL, 20);
        Car c1 = new Car("red", 300, 300000, 10, p1, e1, 90000);

        System.out.println(c1.getPrice());
        System.out.println(c1.getConsumption());

    }
}
