import java.util.*;
public class Ware {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m x n:");
        int m = in.nextInt();
        int n = in.nextInt();
        String warehouseA[][] = new String[m][n];
        System.out.println("Enter stock count of product j in section i of warehouse A:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                warehouseA[i][j] = in.next();
            }
        }
        System.out.println("Enter stock count of product j in section i of warehouse B:");
        String warehouseB[][] = new String[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                warehouseB[i][j] = in.next();
            }
        }
        displayWarehouse(warehouseA, m, n);
        displayWarehouse(warehouseB, m, n);
        sumofWarehouses(warehouseA, warehouseB, m, n);
        in.close();
    }
    public static void displayWarehouse(String warehouse[][], int m, int n){
        System.out.println("Items in the warehouse:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(warehouse[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void sumofWarehouses(String warehouseA[][], String warehouseB[][], int m, int n){
        System.out.println("Total stock count of each product:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int total = Integer.parseInt(warehouseA[i][j]) + Integer.parseInt(warehouseB[i][j]);
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}
