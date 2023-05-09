package BaseAndAlgorithms;

import java.util.Random;
import java.util.Scanner;

public class PoluPoker {

	public static void main(String[] args) {
//		// Инициализация переменных
		String[] cardSuits = { "Крести", "Пики", "Бубны", "Черви" };
		String[] cardValues = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		int cardsPerPlayer = 5;

    Random rnd = new Random();
    int players = 0;
		Card[] deck = new Card[52];


		int l = cardValues.length;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество игроков: ");

    // Пoчему цикл? хуй знает, честно этот момент подглядел, но почему-то без него не работало
		for (;;) {

      // Проверка на int
			if (sc.hasNextInt()) {
				players = sc.nextInt();
				if (cardsPerPlayer * players <= 52) {
//					return;
					break;
				} else if (players <= 0) {
					System.out.println("Не может быть отрицательного/нулевого количества игроков!");
					return;
				}
			} else {
				System.out.println("Вы ввели не число!");
				return;
			}
		}

    // Иницализация массива карточек
		for (int i = 0; i < cardSuits.length; i++) {
			for (int j = 0; j < cardValues.length; j++) {
				deck[l * i + j] = new Card(cardSuits[i], cardValues[j]);
			}
		}

    //Перемешивание колоды(алгоритм Саттоло вроде). Обычно называют просто swap методом
		for (int i = 0; i < deck.length; i++) {
			int j = rnd.nextInt(deck.length - i) + i;
			Card temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}

    //Раздача карт и вывод
		for (int i = 0; i < players; i++) {
			System.out.println("Игрок " + (i + 1) + ":");
			for (int j = 0; j < cardsPerPlayer; j++) {
				System.out.print(deck[cardsPerPlayer * i + j].getValue() + " " + deck[cardsPerPlayer * i + j].getSuit() + " | ");
			}
			System.out.println();
		}
	}
}

// Создание класса карточек
class Card {

	private String suit;
	private String value;

	public Card(
			String suit,
			String value
	) {
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

