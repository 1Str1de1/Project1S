package OOP.Game;

import java.util.Scanner;

public class JavaGame {
    public static int sizeX = 10;
    public static int sizeY = 10;
    public static int amountOfEnemies = 5;
    public static int transistorsAmountNeeded = 100;
    public static int moves = 40;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;

        do {

            System.out.println("Welcome to the JavaGame version 1.0!\n" +
                    "Please select the option and press Enter\n" +
                    "1: Start new game\n" +
                    "2. Options\n" +
                    "3: Credits\n" +
                    "4: Exit.");

            command = scanner.nextLine();
            switch (command) {

                case "1":
                    startNewGame();
                    break;

                case "2":
                    OptionsMenu.showOptionsMenu();
                    break;

                case "3":
                    showCredits();
                    break;

                case "4":
                    break;

                default:
                    System.out.println("Command not recognized. Please try again.");
            }

        } while (!command.equals("4"));
    }

    private static void showCredits() {
        System.out.println("\nCreated by Str1de\n" +
                "Version 1.0 last modified 04.06.2023\n" +
                "Contact me at mrstride1@gmail.com\n");
    }

    private static void openOptionsMenu() {

    }

    private static void startNewGame() {

    }
}
