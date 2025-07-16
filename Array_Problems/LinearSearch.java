// Search an element (Linear Search)
package Array_Problems;

import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Elements of the array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("Enter the target value:");

		int key = s.nextInt();
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println("Element found at index:" + i);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found ");

		}
	}
}