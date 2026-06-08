// Lab 4 - Daily Sales: total sales + best day
import java.util.*;
public class App2 {
// This function contains a BUG. Find it and fix it.
static long totalSales(int[] s) {
long total = 0;
for (int i = 1; i < s.length; i++) total += s[i];
return total;
}
// Return the 1-based index of the day with the highest sales (first on a tie).
static int bestDay(int[] s) {
    int max = s[0];
    int bestDay = 0;
    for (int i = 1; i < s.length; i++) {
        if (s[i] > max) {
            max = s[i];
            bestDay = i+1;
        }
    }
    return bestDay;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] s = new int[n];
for (int i = 0; i < n; i++) s[i] = sc.nextInt();
System.out.println("Total Sales: " + totalSales(s));
System.out.println("Best Day: " + bestDay(s));
sc.close();
}
}