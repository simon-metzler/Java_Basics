package at.sim.exercises.lamp;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        LightElement l1 = new LightElement("l1", "green");
        LightElement l2 = new LightElement("l2", "blue");
        LightElement l3 = new LightElement("l3", "red");

        lamp.addLightElement(l1);
        lamp.addLightElement(l2);
        lamp.addLightElement(l3);

        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        lamp.printNamesOfLightElements();

    }
}
