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
                    "The result is:\n" + result);

            command = scanner.nextLine();

            switch (command) {

                case "+":



                    System.out.println("Which number do tou want to add?");

                    variable = scannerDouble.nextDouble();

                    result += variable;

                    break;

                case "-":

                    System.out.println("Which number do tou want to subtract?");

                    variable = scannerDouble.nextDouble();

                    result -= variable;

                    break;

                case "*":

                    System.out.println("By which number do tou want to multiply?");

                    variable = scannerDouble.nextDouble();

                    result *= variable;

                    break;

                case "/":

                    System.out.println("By which number do tou want to divide?");

                    variable = scannerDouble.nextDouble();

                    result /= variable;

                    break;

                case "0":
                    break;

                default:
                    System.out.println("Command not recognized. Please try again!");
            }

        } while (!command.equals("0"));


    }
}