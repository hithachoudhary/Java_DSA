// Copy an Array

package Array_Problems;

import java.util.*;

public class CopyAnArray {
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

		int copy[] = new int[n];
		for (int i = 0; i < n; i++) {
			copy[i] = a[i];
		}

		System.out.println("Elements of the copy of array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
}