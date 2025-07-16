// Find the sum of elements in an array
package Array_Problems;

import java.util.*;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int sum = 0;
		System.out.println("Elements of the array:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		System.out.println("\n");

		System.out.println("Sum of the elements in the array = " + sum);

	}
}