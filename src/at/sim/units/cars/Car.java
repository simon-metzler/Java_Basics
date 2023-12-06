package at.sim.units.cars;

public class Car {

    private String color;
    private int max_velocity;
    private int base_price;
    private int consumption;
    private Producer producer;
    private Engine engine;
    private int price;

    public Car(String color, int max_velocity, int base_price, int consumption, Producer producer, Engine engine) {
        this.color = color;
        this.max_velocity = max_velocity;
        this.base_price = base_price;
        this.consumption = consumption;
        this.producer = producer;
        this.engine = engine;

        this.price = (int) (this.base_price-(this.producer.getDiscount()*this.base_price));
    }

    public int getPrice() {
        return price;
    }
}
