import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistinctElements {
    public static List<List<Integer>> findDistinctElements(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add all elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();

        // Find distinct elements in nums1
        for (int num : nums1) {
            if (!set2.contains(num)) {
                distinctNums1.add(num);
            }
        }

        // Find distinct elements in nums2
        for (int num : nums2) {
            if (!set1.contains(num)) {
                distinctNums2.add(num);
            }
        }

        answer.add(distinctNums1);
        answer.add(distinctNums2);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = findDistinctElements(nums1, nums2);
        System.out.println("Output: " + result);
    }
}
