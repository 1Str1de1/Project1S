package BaseAndAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ChydesnyeMassivi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 2, 3};
        int k;
        int j = 0;
        while (true) {
            System.out.println("Введите число: ");
            if (sc.hasNextInt()) {
                k = Integer.parseInt(sc.nextLine());
                break;
            } else System.out.println("Вы ввели не число!");
            sc.nextLine();
        }
        sc.close();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Количество искомых элементов: " + j);
    }
    }
