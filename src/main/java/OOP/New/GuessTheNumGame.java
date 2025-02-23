package OOP.New;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int amountOfTries = 5;
        int highestPossibleNumber = 20;
        boolean playAgain = true;
        Random random = new Random();

        while (playAgain) {
            int numToGuess = random.nextInt(highestPossibleNumber) + 1;
            int triesCounter = 0;

            System.out.println("Добро пожаловать в игру Угадай число! \n" +
                    "Задано число от 0 до " + highestPossibleNumber + "\n" +
                    "У вас есть " + amountOfTries + " попыток, чтобы угадать число. Удачи!");

            do {

                System.out.println("Введите число: ");

                if (scanner.hasNextInt()) {

                    inputNum = scanner.nextInt();

                    if (inputNum == numToGuess) {

                        System.out.println("Поздравляем! Вы угадали число!");
                        break;

                    } else if (inputNum > numToGuess) {

                        System.out.println("Ваше число больше заданного!");
                        triesCounter++;

                    } else {

                        System.out.println("Ваше число меньше заданного!");
                        triesCounter++;

                    }

                    System.out.println("Осталось попыток: " + (amountOfTries - triesCounter));

                } else {

                    System.out.println("Вы ввели не число!");
                    scanner.next();

                }
            } while (triesCounter < amountOfTries);
            if (triesCounter == amountOfTries) {
                System.out.println("К сожалению, вы проиграли :(. Попробуйте ещё раз!");
            }

            System.out.println("Хотите сыграть ещё раз?(да/нет)");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("да")) {

                playAgain = false;
                System.out.println("Спасибо за игру! До свидания!");

            }
        }
    }


}
