package at.sim.exercises.Remote_Control;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(100);


        remoteControl.addBattery(battery1);
        remoteControl.addBattery(battery2);

        System.out.println(remoteControl.getStatus());
        remoteControl.turnOn();
        System.out.println(remoteControl.getStatus());
        remoteControl.turnOff();
        System.out.println(remoteControl.getStatus());

    }


}
