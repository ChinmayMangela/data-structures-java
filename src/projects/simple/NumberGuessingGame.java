package projects.simple;

import java.util.*;

class NumberGuessingGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            playGame();
            if (!askForReplay()) break;
        }
    }

    public static void playGame() {
        int numberOfAttempts = 0;
        int difficulty = chooseDifficulty();
        int[] result = getComputerGuessWithMax(difficulty);
        int computerGuess = result[0];
        int maxRange = result[1];
        System.out.print("Enter any number between 1 and " + maxRange + ": ");
        while (true) {
            int userGuess = takeAndValidateGuess(maxRange);
            numberOfAttempts++;
            if (computerGuess == userGuess) {
                System.out.println("you guessed it right in " + numberOfAttempts + " attempts");
                break;
            }
            if (isFarFromTarget(computerGuess, userGuess)) {
                System.out.println("Cold (more than 10 away)");
            } else {
                System.out.println("Hot (within 10)");
            }
            System.out.print("Enter number again: ");
        }
    }

    public static boolean askForReplay() {
        String userChoice;
        System.out.println("Do you want to play again? (yes/no): ");
        while (true) {
            userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("yes")) return true;
            else if (userChoice.equalsIgnoreCase("no")) return false;
            else System.out.print("Please enter 'yes' or 'no': ");
        }
    }

    public static int[] getComputerGuessWithMax(int difficultyLevel) {
        Random random = new Random();
        int max;
        if (difficultyLevel == 1) {
            max = 50;
        } else if (difficultyLevel == 2) {
            max = 100;
        } else {
            max = 500;
        }
        int computerGuess = random.nextInt(max) + 1;
        return new int[]{computerGuess, max};
    }

    public static boolean isFarFromTarget(int computerGuess, int userGuess) {
        boolean isGreaterByTen = userGuess > computerGuess && userGuess - computerGuess > 10;
        boolean isLesserByTen = computerGuess > userGuess && computerGuess - userGuess > 10;
        return isGreaterByTen || isLesserByTen;
    }

    public static int chooseDifficulty() {
        System.out.println("Choose Difficulty:");
        System.out.println("1. Easy (1–50)");
        System.out.println("2. Medium (1–100)");
        System.out.println("3. Hard (1–500)");
        System.out.print("Enter choice: ");

        String userDifficultyChoice;
        while (true) {
            userDifficultyChoice = scanner.nextLine();
            if (userDifficultyChoice.matches("[1-3]")) {
                return Integer.parseInt(userDifficultyChoice);
            }
            System.out.println("Enter valid difficulty level (1, 2, or 3): ");
        }
    }

    public static int takeAndValidateGuess(int max) {
        while (true) {
            String userGuess = scanner.nextLine();
            try {
                int guess = Integer.parseInt(userGuess);
                if (outOfRangeGuess(guess, max)) {
                    System.out.println("Out of range! Enter between 1 and " + max);
                } else {
                    return guess;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a number: ");
            }
        }
    }

    public static boolean outOfRangeGuess(int userGuess, int max) {
        return userGuess < 1 || userGuess > max;
    }

}



