public class MatrixTranspose {

    public static void main(String[] args) {
        // 1. Define the original matrix
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Get the number of rows and columns
        int rows = originalMatrix.length;
        int cols = originalMatrix[0].length;

        // 2. Create a new matrix for the transpose
        // Notice that the rows and columns are swapped
        int[][] transposeMatrix = new int[cols][rows];

        // 3. Compute the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // 4. Print the results
        System.out.println("Original Matrix:");
        printMatrix(originalMatrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transposeMatrix);
    }

    // Helper method to neatly print any 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
