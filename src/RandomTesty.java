import java.util.Random;
import java.util.Scanner;

public class RandomTesty {
    public static void main(String[] args){
        int cardsPerPlayer = 5;
        int players = 0;
        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if(sc.hasNextInt()){
                players = sc.nextInt();
                if(cardsPerPlayer * players <= 52){
                    break;
                } else {
                    if (players ==0){
                        System.out.println("Игра прекращена.");
                        break;
                    } else if (players<0){
                        System.out.println("Число игроков не может быть меньше 0");
                    } else{
                        System.out.println("Слишком много игроков!");
                    }
                }
            } else{
                System.out.println("Вы ввели не число, или Ваше число слишком большое!");
            }
        }
        Random rnd = new Random();
        String[] cardsuits = {"Крести", "Пики", "Бубны", "Черви"};
        String[] cardvalues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int l = cardvalues.length;
        Card[] deck = new Card[52];
        for (int i = 0; i<cardsuits.length;i++){
            for (int j = 0; j<cardvalues.length;j++){
                deck[l*i+j] = new Card();
                deck[l*i+j].cardsuit = cardsuits[i];
                deck[l*i+j].cardvalue = cardvalues[j];
            }
            System.out.println();
        }
        for (int i = 0; i < deck.length;i++) {
            int j = rnd.nextInt(deck.length-i) + i;
            Card temp = new Card();
            temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
            System.out.println(deck[i].cardvalue+" "+deck[i].cardsuit+" ");
        }

      /*  for (int i = 0;i < players;i++){
            System.out.println("Игрок: "+ (i+1));
            for (int j = 0; j < cardsPerPlayer;j++){
                System.out.print(deck[][].cardvalue+" "+deck[][].cardsuit+" ");
            }
            System.out.println();
        }*/

    }
}

