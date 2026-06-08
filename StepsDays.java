import java.util.*;
public class StepsDays {
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day count:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter active days (1 for active, 0 for inactive):");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println("Total active days: " + countActiveDays(arr));
        System.out.println("Longest active streak: " + longestActiveStreak(arr));
        System.out.println("Current Streak: " + currentStreak(arr));
    }
    public static int countActiveDays(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
    public static int longestActiveStreak(int arr[]){
        int maxStreak = 0;
        int currentStreak = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }
        return maxStreak;
    }
    public static int currentStreak(int arr[]){
        int currentStreak = 0;
        for(int i=arr.length - 1; i>=0; i--){
            if(arr[i] == 1){
                currentStreak++;
            } else {
                break;
            }
        }
        return currentStreak;
    }
}
