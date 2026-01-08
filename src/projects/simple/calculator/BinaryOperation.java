package projects.simple.calculator;

public interface BinaryOperation {
    double calculate(double a, double b);
    String showResultMessage(double a, double b, double result);
}
