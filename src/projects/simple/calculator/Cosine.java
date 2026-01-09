package projects.simple.calculator;

public class Cosine implements TrigonometricOperation {
    @Override
    public double calculate(double angle) {
        return Math.cos(angle);
    }

    @Override
    public String showResult(double angle, double result) {
        return "Result: cos(" + angle + "°) = " + result;
    }
}
