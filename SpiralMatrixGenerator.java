import java.util.Scanner;

public class SpiralMatrixGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the spiral matrix (n): ");
        int n = scanner.nextInt();
        
        int[][] matrix = generateSpiralMatrix(n);

        // Print the spiral matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int value = 1;
  
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse from left to right along the top row
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = value++;
            }
            rowStart++;
  
            // Traverse from top to bottom along the rightmost column
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = value++;
            }
            colEnd--;
  
            // Traverse from right to left along the bottom row
            for (int col = colEnd; col >= colStart; col--) {
                matrix[rowEnd][col] = value++;
            }
            rowEnd--;
  
            // Traverse from bottom to top along the leftmost column
            for (int row = rowEnd; row >= rowStart; row--) {
                matrix[row][colStart] = value++;
            }
            colStart++;
        }
        
        return matrix;
    }
}
