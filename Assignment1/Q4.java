import java.util.Arrays;

public class Q4 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            // If no carry-over, return the original array
            if (carry == 0) {
                return digits;
            }
        }

        // Create a new array with carry-over and copy remaining digits
        int[] result = new int[n + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, n);
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        Q4 solution = new Q4();
        int[] result = solution.plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
