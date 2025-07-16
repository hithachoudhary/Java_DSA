// Find the average of elements in an array
package Array_Problems;

import java.util.*;

public class ElementsAvg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int sum = 0;
		System.out.println("Elements of the array:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		System.out.println("\n");

		System.out.println("Avg of the elements in the array = " + (sum / n));

	}
}