// Lab 3 - Array Toolkit: maximum element + count greater than first
import java.util.*;

public class Main {
	// This function contains a BUG. Find it and fix it.
	static int findMax(int[] a) {
		if (a == null || a.length == 0) return Integer.MIN_VALUE;
		int best = a[0];
		for (int v : a) if (v > best) best = v;
		return best;
	}

	// Count the elements (after index 0) strictly greater than the first element.
	static int countGreaterThanFirst(int[] a) {
		if (a == null || a.length <= 1) return 0;
		int first = a[0];
		int cnt = 0;
		for (int i = 1; i < a.length; i++) if (a[i] > first) cnt++;
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		System.out.println("Max: " + findMax(a));
		System.out.println("Greater Than First: " + countGreaterThanFirst(a));
		sc.close();
	}
}
