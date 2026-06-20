import java.util.*;
public class MatrixAddition {

    public static void main(String[] args) {
        // Define the dimensions of the matrices (e.g., 2 rows and 3 columns)
        int rows = 2;
        int columns = 3;

        // Initialize the first matrix
        int[][] matrix1 = {
            {2, 4, 6},
            {8, 10, 12}
        };

        // Initialize the second matrix
        int[][] matrix2 = {
            {1, 3, 5},
            {7, 9, 11}
        };

        // Create a new matrix to store the result of the addition
        int[][] resultMatrix = new int[rows][columns];

        // Add the two matrices using nested loops
        for (int i = 0; i < rows; i++) {           // Iterate through rows
            for (int j = 0; j < columns; j++) {    // Iterate through columns
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}