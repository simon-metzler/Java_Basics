package at.sim.exercises.Remote_Control;

public class Battery {
    private int status;

    public Battery(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void turnOn() {
        System.out.println("Battery turned on");
        this.status -= 5;
    }

    public void turnOff() {
        System.out.println("Battery turned off");
    }

}
