import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int result;
        String operator;
            System.out.println("Введите первое число: ");
            if (scanner.hasNextInt()) {
                firstNumber = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Вы ввели не число!");
                return;
            }
            System.out.println("Введите второе число: ");
            if (scanner.hasNextInt()) {
                secondNumber = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Вы ввели не число!");
                return;
            }
            System.out.println("Введите оператор: ");
            operator = scanner.nextLine();
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            }
            else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            }
            else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
            }
            else if (operator.equals("/")) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Такого оператора не предусмотрено/не существует!");
                return;
            }
        System.out.println("Результат: " + result);
    }
}
