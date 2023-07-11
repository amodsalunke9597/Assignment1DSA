public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        SingleNumber solution = new SingleNumber();
        int result = solution.singleNumber(nums);
        System.out.println(result);
    }
}
