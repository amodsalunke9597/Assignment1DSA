public class Q8 {
    public int minimumScore(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        if (nums.length == 1) {
            return 0;
        }

        if (maxVal - minVal <= 2 * k) {
            return 0;
        }

        return maxVal - k - (minVal + k);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;

        Q8 solution = new Q8();
        int minimumScore = solution.minimumScore(nums, k);

        System.out.println("Output: " + minimumScore);
    }
}
