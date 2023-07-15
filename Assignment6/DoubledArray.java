import java.util.*;

public class DoubledArray {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; // Not a valid doubled array
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        Arrays.sort(changed); // Sort the array to ensure smaller elements are processed first

        for (int num : changed) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                int doubledNum = num * 2;
                if (freqMap.containsKey(doubledNum) && freqMap.get(doubledNum) > 0) {
                    freqMap.put(doubledNum, freqMap.get(doubledNum) - 1);
                    originalList.add(num);
                } else {
                    return new int[0]; // Doubled value not found or count is zero
                }
            }
        }

        int[] originalArray = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            originalArray[i] = originalList.get(i);
        }

        return originalArray;
    }

    public static void main(String[] args) {
        DoubledArray doubledArray = new DoubledArray();
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = doubledArray.findOriginalArray(changed);

        System.out.print("Output: ");
        if (original.length == 0) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.toString(original));
        }
    }
}
