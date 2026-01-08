package projects.simple.calculator;

public class Multiplication implements BinaryOperation {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }

    @Override
    public String showResultMessage(double a, double b, double result) {
        return a + " * " + b + " = " + result;
    }
}
