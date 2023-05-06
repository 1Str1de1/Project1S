import java.util.Arrays;

public class ChydesnyeMassivi {
    public static void main(String[] args) {
        int[] nums = {0, 2, 0, 5};
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        }
    }

