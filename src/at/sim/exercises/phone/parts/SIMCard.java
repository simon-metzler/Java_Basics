package at.sim.exercises.phone.parts;

public class SIMCard {

    int id;
    String number;

    public SIMCard(int id, String number){
        this.id = id;
        this.number = number;
    }

    public void doCall(String number) {
        System.out.println("Calling: " + number);
    }



}
