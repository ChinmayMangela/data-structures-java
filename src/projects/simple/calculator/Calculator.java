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
            println("8. Trigonometric functions");
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
            } else if(choice == 8) {
                handleTrigonometricFunctions();
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

    private static void handleTrigonometricFunctions() {
        while(true) {
            println("Choose a trigonometric function");
            println("1. Sine (sin)");
            println("2. Cosine (cos)");
            println("3. Tangent (tan)");
            println("4. Exit to main menu");
            int trigChoice = takeAndValidateTrigonometricFunction();

            if (trigChoice == 4) {
                println("Returning to main menu...");
                break;
            }
            double angle = takeAndValidateUserInput("Enter angle in degrees: ");
            double normalized = ((angle % 360) + 360) % 360;
            if (trigChoice == 1) {
                double result = Math.sin(Math.toRadians(angle));
                println("Result: sin(" + angle + "°) = " + result);
            } else if (trigChoice == 2) {
                double result = Math.cos(Math.toRadians(angle));
                println("Result: cos(" + angle + "°) = " + result);
            } else if (trigChoice == 3) {
                if (normalized == 90 || normalized == 270) {
                    println("Error: tan(" + angle + "°) is undefined!");
                } else {
                    double result = Math.tan(Math.toRadians(angle));
                    println("Result: tan(" + angle + "°) = " + result);
                }
            }
            println("");
        }

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


    private static int takeAndValidateTrigonometricFunction() {
        print("Select the function: ");
        while (true) {
            String inputOperation = scanner.nextLine();
            try {
                int input = Integer.parseInt(inputOperation);
                if (isInvalidTrigonometricOperation(input)) {
                    print("Out of range! select an option between 1 - 4: ");
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                print("Invalid option! Please enter a number: ");
            }
        }
    }

    private static boolean isInvalidTrigonometricOperation(int inputOperation) {
        return inputOperation < 1 || inputOperation > 4;
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


