package at.sim.units.cars;

public class Main {
    public static void main(String[] args) {


        Producer p1 = new Producer("McLaren","UK", 0.3);
        Engine e1 = new Engine(Engine.TYPE.DIESEL);
        Car c1 = new Car("red", 300, 300000, 10, p1, e1);

        System.out.println(c1.getPrice());

    }
}
