import java.util.Random;
import java.util.Scanner;

public class PoluPoker {
    public static void main(String[] args){
        System.out.println("Введите количество игроков: ");                              // Инициализация переменных
        Scanner sc = new Scanner(System.in);
        int players = 0;
        Card[] deck = new Card[52];
        int cardsPerPlayer = 5;
        Random rnd = new Random();
        String[] cardsuits = {"Крести", "Пики", "Бубны", "Черви"};
        String[] cardvalues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int l = cardvalues.length;
        for(;;) {                                                              //Проверка на int
            if (sc.hasNextInt()) {                                             //почему цикл? хуй знает,честно этот момент подглядел, но очему-то без него не работало
                players = sc.nextInt();
                if(cardsPerPlayer * players <= 52){
                    break;
                } else if (players <= 0) {
                    System.out.println("Не может быть отрицательного/нулевого количества игроков!");
                    System.exit(0);
                }
            } else {
                System.out.println("Вы ввели не число!");
                System.exit(0);
            }
        }
        for (int i = 0; i<cardsuits.length;i++){                                    //Иницализация массива карточек
            for (int j = 0; j<cardvalues.length;j++){
                deck[l*i+j] = new Card();
                deck[l*i+j].cardsuit = cardsuits[i];
                deck[l*i+j].cardvalue = cardvalues[j];
            }
        }
        for (int i = 0; i < deck.length;i++) {                                      //Перемешивание колоды(алгоритм Саттоло вроде)
            int j = rnd.nextInt(deck.length-i) + i;
            Card temp = new Card();
            temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        for (int i = 0;i < players;i++){                                            //Раздача карт и вывод
            System.out.println("Игрок "+(i+1)+":");
            for (int j = 0;j < cardsPerPlayer;j++){
                System.out.print(deck[cardsPerPlayer*i+j].cardvalue+" "+deck[cardsPerPlayer*i+j].cardsuit+" ");
            }
            System.out.println();
        }
    }
}
class Card{                                                                         // Создание класса карточек
    String cardsuit;
    String cardvalue;

}

