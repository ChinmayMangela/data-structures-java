package projects.simple.calculator;

public class Division implements BinaryOperation {

    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Can't divide by 0");
            return Double.NaN;
        }
        return a / b;
    }

    @Override
    public String showResultMessage(double a, double b, double result) {
        return a + " / " + b + " = " + result;
    }
}