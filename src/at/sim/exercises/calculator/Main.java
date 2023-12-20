package at.sim.exercises.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        ScienceCalculator scienceCalculator = new ScienceCalculator();
        SqrtCalculator sqrtCalculator = new SqrtCalculator();

        System.out.println(calculator.divide(1, 2));
        System.out.println(scienceCalculator.cosinus(180));
        System.out.println(sqrtCalculator.sqrt(144));

        System.out.println(scienceCalculator.divide(1, 2));
        System.out.println(sqrtCalculator.divide(1, 2));


    }
}
