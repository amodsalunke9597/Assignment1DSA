public class ArrayInversion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int inversionCount = countInversions(arr);
        
        System.out.println("Number of inversions: " + inversionCount);
    }
    
    public static int countInversions(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }
    
    public static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int inversionCount = 0;
        
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            inversionCount += mergeSort(arr, temp, left, mid);
            inversionCount += mergeSort(arr, temp, mid + 1, right);
            inversionCount += merge(arr, temp, left, mid, right);
        }
        
        return inversionCount;
    }
    
    public static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int inversionCount = 0;
        int i = left;
        int j = mid + 1;
        int k = left;
        
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversionCount += (mid - i + 1);
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
        
        return inversionCount;
    }
}
