public class Q7 {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                isIncreasing = false;
            }
            if (nums[i] > nums[i - 1]) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};

        Q7 solution = new Q7();
        boolean isMonotonic = solution.isMonotonic(nums);

        System.out.println("Output: " + isMonotonic);
    }
}
