import java.util.*;
public class temperature {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of months:");
        int n = in.nextInt();
        System.out.println("Enter readings of temperature for each month:");
        String temperature[][] = new String[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                temperature[i][j] = in.next();
            }
        }
        System.out.println("Average Temperature for the entered months:"+ avgMonth(temperature,n));
        in.close();
    }
    public static double avgMonth(String temperature[][], int n){
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += Double.parseDouble(temperature[i][0]) + Double.parseDouble(temperature[i][1]);
        }
        return sum/(2*n);
    }
}