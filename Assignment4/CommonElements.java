import java.util.ArrayList;

public class CommonElements {
    public static ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (contains(arr2, arr1[i]) && contains(arr3, arr1[i])) {
                commonElements.add(arr1[i]);
            }
        }

        return commonElements;
    }

    private static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        ArrayList<Integer> result = findCommonElements(arr1, arr2, arr3);
        System.out.println("Common Elements: " + result);
    }
}
