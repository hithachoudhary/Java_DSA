// Count frequency of a given number

package Array_Problems;

import java.util.*;

public class CountTarget {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Element:");
		int t = s.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == t) {
				count += 1;
			}

		}
		System.out.println("Count of the target element in the array = " + count);
	}
}