package at.sim.units.cars;

public class Producer {
    private String name;
    private String origin_country;
    private double discount;

    public Producer(String name, String origin_country, double discount) {
        this.name = name;
        this.origin_country = origin_country;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public double getDiscount() {
        return discount;
    }
}
