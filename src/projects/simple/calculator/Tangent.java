package projects.simple.calculator;

public class Tangent implements TrigonometricOperation {
    @Override
    public double calculate(double angle) {
        return Math.tan(angle);
    }

    @Override
    public String showResult(double angle, double result) {
        return "Result: tan(" + angle + "°) = " + result;
    }
}
