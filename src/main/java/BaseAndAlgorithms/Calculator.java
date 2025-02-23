package BaseAndAlgorithms;

import java.util.Scanner;

public class Calculator {

    private static double result = 0;
    public static double variable;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);

        String command;

        do {

            System.out.println("Welcome to the calculator\n" +
                    "Please select an option:\n" +
                    "+: add to a number\n" +
                    "-: subtract a number\n" +
                    "*: multiply by a number\n" +
                    "/: divide by a number\n" +
                    "0: exit\n" +
                    "c: reset\n" +
                    "The result is:\n" + result);

            command = scanner.nextLine();

            switch (command) {

                case "+":
                    System.out.println("Which number do tou want to add?");

                    if (scannerDouble.hasNextDouble()) {

                        variable = scannerDouble.nextDouble();

                        result += variable;

                    } else notANumber();
                    break;

                case "-":
                    System.out.println("Which number do you want to subtract?");

                    if (scannerDouble.hasNextDouble()) {

                        variable = scannerDouble.nextDouble();

                        result -= variable;

                    } else notANumber();
                    break;

                case "*":
                    System.out.println("By which number do tou want to multiply?");

                    if (scannerDouble.hasNextDouble()) {

                        variable = scannerDouble.nextDouble();

                        result *= variable;

                    } else notANumber();
                    break;

                case "/":
                    System.out.println("By which number do tou want to divide?");

                    if (scannerDouble.hasNextDouble()) {

                        variable = scannerDouble.nextDouble();

                        result /= variable;

                    } else notANumber();
                    break;

                case "0":
                    break;

                case "c":
                    result = 0;
                    break;

                default:
                    System.out.println("Command not recognized. Please try again!");
            }

        } while (!command.equals("0"));
    }

    public static void notANumber() {
        System.out.println("You entered not a number! Please try again.\n");

    }

}