import java.util.Scanner;

public class Tugas1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input rows and columns
            System.out.print("Input jumlah baris matriks = ");
            int rows = scanner.nextInt();
            System.out.print("Input jumlah kolom matriks = ");
            int cols = scanner.nextInt();

            // Input matrix values
            int[][] matrix = new int[rows][cols];
            System.out.println("Input nilai-nilai matriks:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Input nilai (" + (i+1) + "," + (j+1) + ") = ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Calculate transpose
            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            // Add original matrix and transpose
            int[][] sumMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrix[i][j] + transpose[j][i];
                }
            }

            // Print original matrix
            System.out.println("\nMatriks asli:");
            printMatrix(matrix);

            // Print transpose matrix
            System.out.println("\nMatriks transpose:");
            printMatrix(transpose);

            // Print sum matrix
            System.out.println("\nJumlahkan matriks asli dengan transpose:");
            printMatrix(sumMatrix);

            scanner.close();
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
}

