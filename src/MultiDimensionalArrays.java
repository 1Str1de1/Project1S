public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] nums = new int[6][7];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();
            for (int i = 0; i<nums.length;i++){
                for (int j = 0; j<nums[i].length;j++){
                    if (nums[i][0] < nums[i][j]){
                        nums [i][0] = nums[i][j];
                    }
                }
            }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}





