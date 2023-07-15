import java.util.Arrays;

public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < k; p++) {
                    if (mat1[i][p] != 0 && mat2[p][j] != 0) {
                        result[i][j] += mat1[i][p] * mat2[p][j];
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SparseMatrixMultiplication multiplication = new SparseMatrixMultiplication();

        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        int[][] result = multiplication.multiply(mat1, mat2);

        System.out.println("Output:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
