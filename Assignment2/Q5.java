import java.util.Arrays;

public class Q5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int minProduct = nums[0] * nums[1] * nums[n - 1];
        return Math.max(maxProduct, minProduct);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Q5 solution = new Q5();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Output: " + maxProduct);
    }
}
