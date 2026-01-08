package projects.simple.calculator;

import java.util.*;

class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, BinaryOperation> binaryOperationMap = new HashMap<>();
    private static final Map<Integer, UnaryOperation> unaryOperationMap = new HashMap<>();

    static {
        binaryOperationMap.put(1, new Addition());
        binaryOperationMap.put(2, new Subtraction());
        binaryOperationMap.put(3, new Multiplication());
        binaryOperationMap.put(4, new Division());
        binaryOperationMap.put(5, new Modulus());
        binaryOperationMap.put(6, new Power());
        unaryOperationMap.put(7, new SquareRoot());
    }

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        chooseOperation();
    }

    public static void chooseOperation() {
        greet();
        while (true) {
            println("Choose one operation:");
            println("1. Add");
            println("2. Subtract");
            println("3. Multiply");
            println("4. Divide");
            println("5. Modulus");
            println("6. Power");
            println("7. Square Root");
            println("8. Trigonometric  functions");
            println("9. Memory Options");
            println("10. Exit");


            int choice = takeAndValidateOperation();
            if (choice == 10) {
                println("Goodbye!");
                break;
            }

            if (choice == 6) {
                double base = takeAndValidateUserInput("Enter base number: ");
                double exponent = takeAndValidateUserInput("Enter exponent: ");
                double result = binaryOperationMap.get(choice).calculate(base, exponent);
                println(binaryOperationMap.get(choice).showResultMessage(base, exponent, result));
            } else if (choice == 7) {
                double number = takeAndValidateUserInput("Enter a number: ");
                double result = unaryOperationMap.get(choice).calculate(number);
                println(unaryOperationMap.get(choice).showResultMessage(number, result));
            } else {
                double firstNumber = takeAndValidateUserInput("Enter first number: ");
                double secondNumber = takeAndValidateUserInput("Enter second number: ");
                double result = binaryOperationMap.get(choice).calculate(firstNumber, secondNumber);
                println(binaryOperationMap.get(choice).showResultMessage(firstNumber, secondNumber, result));
            }

            String input = playAgain();
            println("");
            if (input.equals("no")) break;
        }

    }


    public static void greet() {
        println("Welcome to Advanced Calculator");
    }

    private static double takeAndValidateUserInput(String message) {
        print(message);
        while (true) {
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                print("Enter a valid number: ");
            }
        }
    }


    private static int takeAndValidateOperation() {
        print("Select the operation: ");
        while (true) {
            String inputOperation = scanner.nextLine();
            try {
                int operation = Integer.parseInt(inputOperation);
                if (isInvalidOperation(operation)) {
                    print("Out of range! select an option between 1 - 10: ");
                } else {
                    return operation;
                }
            } catch (NumberFormatException e) {
                print("Invalid option! Please enter a number: ");
            }
        }
    }


    private static boolean isInvalidOperation(int operation) {
        return operation < 1 || operation > 10;
    }

    private static void print(String message) {
        System.out.print(message);
    }

    private static void println(String message) {
        System.out.println(message);
    }


    public static String playAgain() {
        print("Do you want to perform another calculation? (yes/no): ");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                return input;
            } else {
                print("Invalid input!!. please tell us whether you want to perform other operation or not: (yes/no)");
            }
        }
    }
}


