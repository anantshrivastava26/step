import java.util.*;
public class TransportationCostMatrix {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m x n:");
        int m = in.nextInt();
        int n = in.nextInt();
        String costMatrix[][] = new String[m][n];
        System.out.println("Enter transportation cost from source i to destination j:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                costMatrix[i][j] = in.next();
            }
        }
        System.out.println("Enter transportation cost from source j to destination k:");
        String costMatrix2[][] = new String[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                costMatrix2[i][j] = in.next();
            }
        }
        displayCostMatrix(costMatrix,costMatrix2, m, n);
        in.close();
    }
    public static void displayCostMatrix(String costMatrix[][], String costMatrix2[][], int m, int n){
        System.out.println("Transportation Cost Matrix Multiplication:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int multiple = 0;
                for(int k=0; k<n; k++){
                    multiple += Integer.parseInt(costMatrix[i][k]) * Integer.parseInt(costMatrix2[k][j]);
                }
                System.out.print(multiple + " ");
            }
            System.out.println();
        }
    }
}
