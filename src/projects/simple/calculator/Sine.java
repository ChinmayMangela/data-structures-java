package projects.simple.calculator;

public class Sine implements TrigonometricOperation {
    @Override
    public double calculate(double angle) {
        return Math.sin(angle);
    }

    @Override
    public String showResult(double angle, double result) {
        return "Result: sin(" + angle + "°) = " + result;
    }
}
