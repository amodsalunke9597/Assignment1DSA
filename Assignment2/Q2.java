import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandies.add(candy);
            if (uniqueCandies.size() == candyType.length / 2) {
                return candyType.length / 2;
            }
        }

        return uniqueCandies.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};

        Q2 solution = new Q2();
        int maxTypes = solution.distributeCandies(candyType);

        System.out.println("Output: " + maxTypes);
    }
}
