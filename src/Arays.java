public class Arays {
public static void main(String[] args){
    int[] nums = new int [5];
    int max = 0;
    for (int i = 0; i < nums.length;i++){
        nums[i] = (int)(Math.random()*10);
        System.out.print(nums[i] + "\t");
    }
    System.out.println();
    for (int i = 0; i < nums.length;i++){
        for (int j = i + 1; j < nums.length;j++)
        if (nums[i] > max) {
            max = nums[i];
        }
    }
    System.out.print(max);
}
}
