package OOP.Collections;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hash.add(10);
        hash.add(12);
        hash.add(5);
        hash.add(10);
        hash.add(14);

        treeSet.add("Zinger");
        treeSet.add("Java");
        treeSet.add("Abba");

        System.out.println(hash);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
