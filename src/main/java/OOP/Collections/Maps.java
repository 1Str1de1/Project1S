package OOP.Collections;

import java.util.TreeMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedFruits = new TreeMap<>();

        sortedFruits.put(150, "Banana");
        sortedFruits.put(250, "Mandarin");
        sortedFruits.put(100, "Melon");

        System.out.println(sortedFruits);

        System.out.println("Самый дешёвый фрукт " + sortedFruits.firstEntry());
        System.out.println("Самый дорогой фрукт " + sortedFruits.lastEntry());

    }
}
