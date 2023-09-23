public class Rotate90Degrees {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrix90Degrees(matrix);
        System.out.println("Rotated 90 Degrees Clockwise:");
        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrix90Degrees(int[][] matrix) {
        // Step 1: Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Step 2: Reverse each row of the transposed matrix
        int[][] rotatedMatrix = reverseMatrix(transposedMatrix);

        return rotatedMatrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static int[][] reverseMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversed = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversed[i][j] = matrix[i][cols - 1 - j];
            }
        }

        return reversed;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
