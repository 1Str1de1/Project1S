package OOP.Game;

import java.util.Scanner;

public class OptionsMenu {
    static Scanner scanner = new Scanner(System.in);

    static int command;

    public static void showOptionsMenu() {
        do {

            System.out.println("Select the option and press Enter\n" +
                    "1: Show current settings\n" +
                    "2: Change settings\n" +
                    "3: Exit");

            command = scanner.nextInt();

            switch (command) {

                case 1:
                    System.out.println("\nCurrent settings:\n" +
                            "rows: " + JavaGame.sizeX +
                            "\ncolumns: " + JavaGame.sizeY +
                            "\nenemies: " + JavaGame.amountOfEnemies +
                            "\ntransistors: " + JavaGame.transistorsAmountNeeded +
                            "\nmoves: " + JavaGame.moves +
                            "\nflowers:" + JavaGame.amountOfFlowers + "\n");
                    break;

                case 2:

                    System.out.println("Enter a new amount of rows: ");
                    JavaGame.sizeX = scanner.nextInt();

                    System.out.println("Enter a new amount of columns: ");
                    JavaGame.sizeY = scanner.nextInt();

                    System.out.println("Enter a new amount of enemies: ");
                    JavaGame.amountOfEnemies = scanner.nextInt();

                    System.out.println("Enter a new amount of transistors: ");
                    JavaGame.transistorsAmountNeeded = scanner.nextInt();

                    System.out.println("Enter a new amount of moves: ");
                    JavaGame.moves = scanner.nextInt();

                    System.out.println("Enter a new amount of flowers: ");
                    JavaGame.amountOfFlowers = scanner.nextInt();

                    break;

                case 3:

                    break;

                default:
                    System.out.println("Command not recognized. Please try again.");
                    break;
            }

        } while (command != 3);

    }
}
