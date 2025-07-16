// Find the index of a specific element
package Array_Problems;

import java.util.*;

public class IndexOfSpecificElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Target Element:");
		int t = s.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i] == t) {
				System.out.println("Index of the target element in the array = " + i);
			}
		}
	}
}