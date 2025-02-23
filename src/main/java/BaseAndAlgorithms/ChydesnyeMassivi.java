package BaseAndAlgorithms;

import java.util.Arrays;

public class ChydesnyeMassivi {

    public static void main(String[] args) {

        int stepsCount = 0;
        int n = 10;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {

            nums[i] = (int) (Math.random() * 10);
            System.out.print(nums[i] + " ");

        }

        for (int i = 0; i < nums.length - 1; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[i]) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

