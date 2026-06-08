import java.util.*;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Threshold: ");
        int threshold = in.nextInt();
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
        System.out.println("Total Stock: "+ totalStock(arr));
        System.out.println("Low Stock: "+belowThreshold(arr, threshold));
        System.out.println("Lowest Stock: "+min(arr));
        System.out.println("Restock Needed: "+restockNeeded(arr, threshold));
    }

    public static int totalStock(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            }
        return total;
    }

    public static int belowThreshold(int[] arr, int threshold) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                count++;
            }
        }
        return count;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int restockNeeded(int[] arr, int threshold) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                count++;
            }
        }
        return count;
    }
}