package projects.simple;

import java.util.*;

class RockPaperScissor {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final Map<Integer, String> choiceMap = new HashMap<>();
    private static final String[] computerTaunts = {"Computer is getting smarter...", "Ouch! That must hurt 😅", "Try again, human!",};
    private static int userWinCount = 0;
    private static int computerWinCount = 0;
    private static int tieCount = 0;

    static {
        choiceMap.put(1, "Rock");
        choiceMap.put(2, "Scissors");
        choiceMap.put(3, "Paper");
        choiceMap.put(4, "Exit");
    }

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        greet();
        while (true) {
            showInputOptions();
            int userChoice = selectAndValidateInput();
            int computerChoice = random.nextInt(3) + 1;
            if (userChoice == 4) {
                println("You chose: Exit");
                println("Goodbye! Thanks for playing Rock–Paper–Scissors.");
                println("Final Scoreboard:");
                println("You: " + userWinCount + " | Computer: " + computerWinCount +  " | Tie: " + tieCount);
                break;
            } else {
                executeResult(userChoice, computerChoice);
            }
            println("");

            String playAgain = wannaPlayAgain();
            if (playAgain.equals("no")) break;
        }
    }

    public static void greet() {
        println("Welcome to Rock–Paper–Scissors!");
    }

    private static void showInputOptions() {
        println("\nChoose one option:");
        choiceMap.forEach((key, value) -> println(key + ". " + value));
    }

    private static int selectAndValidateInput() {
        print("\nSelect your choice: ");
        while (true) {
            String userInput = scanner.nextLine();
            try {
                int input = Integer.parseInt(userInput);
                if (isNotValidInput(input)) {
                    print("Out of range. select between 1-4: ");
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                print("Invalid input. Please enter a number as an input: ");
            }
        }
    }

    private static void executeResult(int userChoice, int computerChoice) {
        println("You chose: " + choiceMap.get(userChoice));

        println("Computer chose: " + choiceMap.get(computerChoice));
        if (hasUserWon(userChoice, computerChoice)) {
            println("Result: You win! 🎉");
            println("You are on fire");
            userWinCount++;
        } else if (userChoice == computerChoice) {
            println("Result: It's a tie 🤝");
            tieCount++;
        } else {
            println("Result: Computer Win! 🎉");
            println(computerTaunts[random.nextInt(computerTaunts.length)]);
            computerWinCount++;
        }
        println("\nScoreboard:");
        println("You: " + userWinCount + " | Computer: " + computerWinCount + " | Tie: " + tieCount);
    }

    private static boolean hasUserWon(int userChoice, int computerChoice) {
        return ((userChoice == 1 && computerChoice == 2) || (userChoice == 2 && computerChoice == 3) || (userChoice == 3 && computerChoice == 1));
    }

    private static String wannaPlayAgain() {
        print("Do you want to play again? (yes/no): ");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (validYesOrNoPrompt(input)) {
                return input;
            } else {
                print("Enter valid choice. between yes or no: ");
            }
        }
    }

    private static boolean validYesOrNoPrompt(String input) {
        return input.equals("yes") || input.equals("no");
    }

    private static boolean isNotValidInput(int input) {
        return input < 1 || input > 4;
    }

    private static void print(String message) {
        System.out.print(message);
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
