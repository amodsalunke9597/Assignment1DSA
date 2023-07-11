import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        if (nums[0] > lower) {
            result.add(formatRange(lower, nums[0] - 1));
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                result.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }

        if (nums[n - 1] < upper) {
            result.add(formatRange(nums[n - 1] + 1, upper));
        }

        return result;
    }

    private String formatRange(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        MissingRanges solution = new MissingRanges();
        List<String> result = solution.findMissingRanges(nums, lower, upper);
        System.out.println(result);
    }
}
