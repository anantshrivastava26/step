import java.util.*;
public class Steps {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day count:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter steps taken each day:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println("Total steps taken: " + countSteps(arr));
        System.out.printf("Average steps per day: %.2f%n", (countSteps(arr) / (double) n));
        System.out.println("Best Day: Day" + findBestDay(arr));
        System.out.println("Goal Achieved: " + goalSteps(arr));
    }
    public static int countSteps(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count += arr[i];
        }
        return count;
    }
    public static int findBestDay(int arr[]){
        int maxSteps = arr[0];
        int bestDay = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxSteps){
                maxSteps = arr[i];
                bestDay = i + 1;
            }
        }
        return bestDay;
    }
    public static int goalSteps(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 10000){
                count++;
            }
        }
        return count;
    }
}
