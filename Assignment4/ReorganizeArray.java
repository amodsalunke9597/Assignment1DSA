import java.util.Arrays;

public class ReorganizeArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] reorganizedArray = shuffle(nums, n);

        System.out.println("Reorganized array: " + Arrays.toString(reorganizedArray));
    }
}
