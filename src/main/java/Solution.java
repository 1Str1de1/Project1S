public class Solution {
    public static void main(String[] args) {

        String s = "abcbcbbc";
        int num = 0;

        num =   lengthOfLongestSubstring(s);


    }

    public static int lengthOfLongestSubstring(String s) {
        int number = 1;
        char[] chars = s.toCharArray();
        char[] usedChars = new char[26];

        for (int i = 0, j = 0; i < chars.length; i++) {

            if (chars[i] != chars[i + 1]) {

            }

        }
        return number;
    }
}
