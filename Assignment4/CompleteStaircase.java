public class CompleteStaircase {
    public static int arrangeCoins(int n) {
        int rows = 0;
        int k = 1;

        while ((k * (k + 1)) / 2 <= n) {
            rows++;
            k++;
        }

        return rows;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}

