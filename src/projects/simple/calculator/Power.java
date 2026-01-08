package projects.simple.calculator;

public class Power implements BinaryOperation {

    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public String showResultMessage(double a, double b, double result) {
        return a + " raised to the power of " + b + " = " + result;
    }
}