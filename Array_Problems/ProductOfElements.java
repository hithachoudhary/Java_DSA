// Multiply all elements of the array
package Array_Problems;

import java.util.*;

public class ProductOfElements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int product = 1;
		System.out.println("Elements of the array:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			product *= a[i];
		}
		System.out.println("\n");

		System.out.println("Product of the elements in the array = " + product);

	}
}