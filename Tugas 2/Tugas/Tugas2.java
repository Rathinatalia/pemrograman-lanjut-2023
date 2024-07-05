import java.util.ArrayList;
import java.util.Scanner;

public class Tugas2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input rows and columns
            System.out.print("Input jumlah baris matriks = ");
            int rows = scanner.nextInt();
            System.out.print("Input jumlah kolom matriks = ");
            int cols = scanner.nextInt();

            // Input matrix values
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
            System.out.println("Input nilai-nilai matriks:");
            for (int i = 0; i < rows; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < cols; j++) {
                    System.out.print("Input nilai (" + (i+1) + "," + (j+1) + ") = ");
                    row.add(scanner.nextInt());
                }
                matrix.add(row);
            }

            // Calculate transpose
            ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int i = 0; i < rows; i++) {
                    row.add(matrix.get(i).get(j));
                }
                transpose.add(row);
            }

            // Add original matrix and transpose
            ArrayList<ArrayList<Integer>> sumMatrix = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < cols; j++) {
                    row.add(matrix.get(i).get(j) + transpose.get(j).get(i));
                }
                sumMatrix.add(row);
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

        public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
            for (ArrayList<Integer> row : matrix) {
                for (Integer elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
}


