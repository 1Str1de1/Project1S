import java.util.Scanner;

public class ImJavaDeveloper {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] subsentence = sentence.split(" ");
        int a = 0;
        String s = "";
        String space = "";
        for (int i = 0; i < subsentence.length; i++){
            if (subsentence[i].length() > a){
                a = subsentence[i].length();
            }
        }
        for (int i = 0; i < a + 4; i++){
            s += "*";
        }
        System.out.println(s);
        for (int i = 0; i < subsentence.length; i++) {
            for (int j = 0; j < a - subsentence[i].length();j++){
                space += " ";
            }
            System.out.println("* " + subsentence[i] + space + " *");
            space = "";
        }
        System.out.println(s);


    }
}
