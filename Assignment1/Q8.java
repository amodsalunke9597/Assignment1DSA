import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q8 {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int duplicate = -1;
        int missing = -1;

        for (int num : nums) {
            if (numSet.contains(num)) {
                duplicate = num;
            }
            numSet.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        Q8 solution = new Q8();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
