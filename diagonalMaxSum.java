import java.util.*;
public class diagonalMaxSum {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int maxSum = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += matrix[j][(i+j)%n];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Maximum diagonal sum: " + maxSum);
        in.close();
    }
}
