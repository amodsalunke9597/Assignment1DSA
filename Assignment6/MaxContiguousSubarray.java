import java.util.Map;
import java.util.HashMap;

public class MaxContiguousSubarray {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        MaxContiguousSubarray maxContiguousSubarray = new MaxContiguousSubarray();
        int[] nums = {0, 1};
        int result = maxContiguousSubarray.findMaxLength(nums);

        System.out.println("Output: " + result);
    }
}
