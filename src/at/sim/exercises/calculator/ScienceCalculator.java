package at.sim.exercises.calculator;

public class ScienceCalculator extends Calculator {

    public double sinus(double a) {
        double b = a * (Math.PI / 180);
        return Math.sin(b);
    }

    public double cosinus(double a) {
        double b = a * (Math.PI / 180);
        return Math.cos(b);
    }

}
