import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }
            complementMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Q1 solution = new Q1();
        int[] indices = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(indices)); // Output: [0, 1]
    }
}
