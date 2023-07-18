public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(nums);
        
        System.out.println("Majority Element: " + majorityElement);
    }
    
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;
        
        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
            }
            
            if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        
        return majorityElement;
    }
}
