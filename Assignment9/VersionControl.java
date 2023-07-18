public class VersionControl {
    public static void main(String[] args) {
        int n = 5;
        int firstBadVersion = findFirstBadVersion(n);
        
        System.out.println("First Bad Version: " + firstBadVersion);
    }
    
    public static int findFirstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    // The API method to check if a version is bad
    public static boolean isBadVersion(int version) {
        // Implementation of the API method goes here
        // Returns true if the version is bad, false otherwise
        return false;
    }
}
