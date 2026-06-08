import java.util.*;
public class rotateMatrix90 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        rotateMatrix90 obj = new rotateMatrix90();
        obj.rotate(matrix);
        System.out.println("Rotated Matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
