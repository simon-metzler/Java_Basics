package at.sim.exercises.lamp;

public class LightElement {

    private String name;
    private String color;
    private int powerUsage;
    private boolean state;

    public LightElement(String name, String color) {
        this.name = name;
        this.color = color;
        this.powerUsage = 0;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void turnOn() {
        if (this.state == true) {
            System.out.println("Name: " + this.name + ". Already turned on.");
        }
        else {
            this.state = true;
            this.powerUsage += 5;
        }





    }

}
