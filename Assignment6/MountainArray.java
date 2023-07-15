public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        // Check for increasing sequence
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // If there is no increasing sequence or it is the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Check for decreasing sequence
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        MountainArray mountainArray = new MountainArray();
        int[] arr = {2, 1};
        boolean result = mountainArray.validMountainArray(arr);

        System.out.println("Output: " + result);
    }
}

