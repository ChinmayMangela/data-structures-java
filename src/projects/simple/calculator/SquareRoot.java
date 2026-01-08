package projects.simple.calculator;

public class SquareRoot implements UnaryOperation {

    @Override
    public double calculate(double a) {
        return Math.sqrt(a);
    }

    @Override
    public String showResultMessage(double a, double result) {
        return "Power of " + a + " is " + result;
    }


}