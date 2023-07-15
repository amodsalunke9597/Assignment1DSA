import java.util.Arrays;

public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = num++;
            }
            rowStart++;

            // Traverse down
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = num++;
            }
            colEnd--;

            // Traverse left
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    matrix[rowEnd][col] = num++;
                }
                rowEnd--;
            }

            // Traverse up
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    matrix[row][colStart] = num++;
                }
                colStart++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int n = 3;
        int[][] result = spiralMatrix.generateMatrix(n);

        System.out.println("Output:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
