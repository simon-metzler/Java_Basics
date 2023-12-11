package at.sim.units.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private TYPE type;

    private int performance;

    public Engine(TYPE type, int performance) {
        this.type = type;
        this.performance = performance;
    }

}
