package BaseAndAlgorithms;

import java.util.Scanner;

public class IamJavaDeveloperArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] subsentence = sentence.split(" ");
        int rows = 1;
        int col = 0;
        String space = "";
        char[] charsentence = sentence.toCharArray();
        for (int i = 0; i < subsentence.length; i++) {
            if (subsentence[i].length() > col) {
                col = subsentence[i].length();
            }
        }
        for (int i = 0; i < charsentence.length; i++) {
            if (Character.isWhitespace(charsentence[i])) {
                rows++;
            }
        }
        String[] sum = new String[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col - subsentence[i].length(); j++) {
                space += " ";
            }
            sum[i] = "* " + subsentence[i] + space + " *";
            space = "";
        }
        String[] sum1 = new String[rows + 2];
        for (int i = 0; i < rows + 2; i++) {
            if ((i <= rows) & (i != 0)) {
                sum1[i] = sum[i - 1];
            } else sum1[i] = "";
            for (int j = 0; j < col + 4; j++) {
                if ((i == 0) || (i == rows + 1)) {
                    sum1[i] += "*";
                }
            }
            System.out.println(sum1[i]);
        }
    }
}