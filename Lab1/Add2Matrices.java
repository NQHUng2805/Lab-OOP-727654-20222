import java.util.Scanner;
public class Add2Matrices {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Input rows and columns, separated by space: ");
        int rows = key.nextInt();
        int cols = key.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Elements of the same row must be separated by a space. Hit enter to input the next row.");
        System.out.println("Input the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = key.nextInt();
            }
        }

        System.out.println("Input the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = key.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        key.close();
    }
}
