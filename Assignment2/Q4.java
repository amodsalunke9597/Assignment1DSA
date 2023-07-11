public class Q4 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;

                if (count >= n) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        Q4 solution = new Q4();
        boolean canPlace = solution.canPlaceFlowers(flowerbed, n);

        System.out.println("Output: " + canPlace);
    }
}
