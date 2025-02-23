package BaseAndAlgorithms;

public class PerestanovkaBukv {
    public static void main(String[] args){
        String abc0 = "abc";
        char[] abc = abc0.toCharArray();
        for (int i = 0, j = 1, k = 2; (i < abc.length); i++, j++, k++){
            System.out.print(abc[i]+" "+abc[i]+abc[j]+" "+abc[i]+abc[k]+" "+abc[i]+abc[j]+abc[k]+" "+abc[i]+abc[k]+abc[j]+" ");
            if (k == abc.length-1){
                k = -1;
            }
            if (j == abc.length-1){
                j = -1;
            }
        }
    }
}
