import java.util.Arrays;

public class Q2 {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Q2 solution = new Q2();
        int k = solution.removeElement(nums, val);

        // Modify the output to represent remaining elements with underscores
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            outputBuilder.append(nums[i]);
            if (i != k - 1) {
                outputBuilder.append(", ");
            } else {
                outputBuilder.append(", _, _");
            }
        }
        System.out.println("Output: " + k + ", nums = [" + outputBuilder.toString() + "]");
    }
}
