public class PermutationReconstruction {
    public int[] reconstructPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        int maxNum = n;
        int minNum = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = minNum++;
            } else {
                perm[i] = maxNum--;
            }
        }

        perm[n] = minNum;

        return perm;
    }

    public static void main(String[] args) {
        PermutationReconstruction reconstruction = new PermutationReconstruction();
        String s = "IDID";
        int[] perm = reconstruction.reconstructPermutation(s);

        System.out.println("Permutation: ");
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}
