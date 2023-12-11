package at.sim.units.cars;

public class Car {

    private String color;
    private int max_velocity;
    private int base_price;
    private double base_consumption;
    private double consumption;
    private int distance;
    private Producer producer;
    private Engine engine;
    private int price;

    public Car(String color, int max_velocity, int base_price, double base_consumption, Producer producer, Engine engine, int distance) {
        this.color = color;
        this.max_velocity = max_velocity;
        this.base_price = base_price;
        this.base_consumption = base_consumption;
        this.producer = producer;
        this.engine = engine;
        this.distance = distance;

        this.price = (int) (this.base_price-(this.producer.getDiscount()*this.base_price));

        if (this.distance < 50000){
            this.consumption = this.base_consumption;
        }
        else {
            this.consumption = this.base_consumption * 1.098;
        }

    }

    public int getPrice() {
        return price;
    }

    public double getConsumption() {
        return consumption;
    }
}
