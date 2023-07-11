import java.util.Arrays;

public class Q1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        Q1 solution = new Q1();
        int maxSum = solution.arrayPairSum(nums);

        System.out.println("Output: " + maxSum);
    }
}
