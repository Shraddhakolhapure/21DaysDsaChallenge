import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the elements of the matrix:");

        // Input the matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Generate and print the spiral matrix traversal
        int[] spiralTraversal = generateSpiralTraversal(matrix, m, n);
        System.out.println("Spiral Matrix Traversal:");
        for (int value : spiralTraversal) {
            System.out.print(value + " ");
        }

        // Close the scanner
        scanner.close();
    }

    public static int[] generateSpiralTraversal(int[][] matrix, int m, int n) {
        int[] result = new int[m * n];
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            top++;

            // Traverse from top to bottom along the rightmost column
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;

            // Traverse from right to left along the bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            // Traverse from bottom to top along the leftmost column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }

        return result;
    }
}
