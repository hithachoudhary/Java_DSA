// Print array in reverse order

package Array_Problems;

import java.util.*;

public class PrintAReverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Elements of the original array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		System.out.println("Elements of the reverse of array:");

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}
}