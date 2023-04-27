
public class ChydesnyeMassivi {
    public static void main(String[] args) {
        // Немного изменённый массив (проверял иные входные условия)
        int[] nums = {0, 2, 0, 5, 3, 0, 6, 12, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.print(nums[i] + " ");
        }
    }
}
