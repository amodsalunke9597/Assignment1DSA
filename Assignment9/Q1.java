import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result)); // Output: [1, 2]
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Found the pair, return the indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                // Sum is less than target, move left pointer to increase the sum
                left++;
            } else {
                // Sum is greater than target, move right pointer to decrease the sum
                right--;
            }
        }

        // No solution found
        return new int[0];
    }
}
