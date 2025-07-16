// Find the maximum element
package Array_Problems;

import java.util.*;

public class Max_Element {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int max = a[0];
		System.out.println("Elements of the array:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Maximum element in the array = " + max);

	}
}