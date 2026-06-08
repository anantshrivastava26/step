import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
        double avg = average(arr);
        System.out.printf("Average: %.2f%n", avg);
        System.out.println("Highest: "+max(arr));
        System.out.println("Passed: "+pass(arr));
        System.out.println("Above Average: "+aboveAverage(arr));
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
     public static int pass(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 40) {
                count++;
            }
        }
        return count;
    }
    public static int aboveAverage(int[] arr) {
        int count = 0;
        double avg = average(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        return count;
    }
}