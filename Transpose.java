import java.util.*;
public class Transpose {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m x n:");
        int m = in.nextInt();
        int n = in.nextInt();
        String matrix[][] = new String[m][n];
        System.out.println("Enter elements of the matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = in.next();
            }
        }
        displayMatrix(matrix, m, n);
        transposeMatrix(matrix, m, n);
        in.close();
    }   
    public static void displayMatrix(String matrix[][], int m, int n){
        System.out.println("Original Matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void transposeMatrix(String matrix[][], int m, int n){
        System.out.println("Transposed Matrix:");
        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
