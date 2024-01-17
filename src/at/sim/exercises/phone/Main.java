package at.sim.exercises.phone;

import at.sim.exercises.phone.parts.Camera;
import at.sim.exercises.phone.parts.SDCard;
import at.sim.exercises.phone.parts.SIMCard;

public class Main {
    public static void main(String[] args) {

        SIMCard simCard = new SIMCard(124453, "+43 567 12325353");
        SDCard sdCard = new SDCard(2048);
        Camera camera = new Camera(100);

        Phone phone = new Phone("Blue", simCard, camera, sdCard);

    }
}
