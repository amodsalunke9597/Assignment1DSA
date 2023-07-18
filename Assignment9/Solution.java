public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        
        // Find the starting position
        result[0] = findStartPosition(nums, target);
        
        // Find the ending position
        result[1] = findEndPosition(nums, target);
        
        return result;
    }
    
    private int findStartPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
            if (nums[mid] == target) {
                position = mid;
            }
        }
        
        return position;
    }
    
    private int findEndPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
            if (nums[mid] == target) {
                position = mid;
            }
        }
        
        return position;
    }

        public static void main(String[] args) {
            Solution solution = new Solution();
            
            int[] nums = {5, 7, 7, 8, 8, 10};
            int target = 8;
            
            int[] result = solution.searchRange(nums, target);
            
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        }
    
}
