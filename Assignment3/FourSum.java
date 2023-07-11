import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {
            int num1 = nums[i];
            if (num1 > target / 4)
                break;
            if (i > 0 && num1 == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                int num2 = nums[j];
                if (num1 + num2 > target / 2)
                    break;
                if (j > i + 1 && num2 == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int currSum = num1 + num2 + nums[left] + nums[right];
                    if (currSum == target) {
                        result.add(Arrays.asList(num1, num2, nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        left++;
                        right--;
                    } else if (currSum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        FourSum solution = new FourSum();
        List<List<Integer>> result = solution.fourSum(nums, target);

        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
