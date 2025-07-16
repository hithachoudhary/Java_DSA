// Swap first and last elements

package Array_Problems;

import java.util.*;

public class SwapFirstAndLast {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Elements of the array:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Elements after swapping first and last elements:");

		int temp = a[0];
		a[0] = a[n - 1];
		a[n - 1] = temp;

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}