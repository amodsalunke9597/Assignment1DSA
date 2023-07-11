import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (countMap.containsKey(num + 1)) {
                int len = count + countMap.get(num + 1);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        Q3 solution = new Q3();
        int maxLen = solution.findLHS(nums);

        System.out.println("Output: " + maxLen);
    }
}
