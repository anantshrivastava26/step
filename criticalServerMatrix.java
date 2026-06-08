import java.util.*;
public class criticalServerMatrix {
    public void main(String args[]) throws Exception{
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
        displayMatrix(matrix);
        System.out.println("Positions of Critical servers:");
        checkCriticalServers(matrix);
        in.close();
    }
    public static void checkCriticalServers(int[][] matrix){    
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(isCritical(matrix, i, j)){
                    System.out.println("Row: " + i + ", Column: " + j);
                }
            }
        }
    }
    public static boolean isCritical(int[][] matrix, int i, int j){
        int current = matrix[i][j];
        int n = matrix.length;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int k=0; k<8; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < n){
                if(matrix[x][y] >= current){
                    return false;
                }
            }
        }
        return true;
    }
    public void displayMatrix(int matrix[][]){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

