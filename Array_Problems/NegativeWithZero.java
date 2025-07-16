// Replace all negative numbers with zero
package Array_Problems;

import java.util.*;

public class NegativeWithZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = s.nextInt();
		}
		int p = 0;
		int n = 0;
		System.out.println("Elements of the array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < t; i++) {
			if (a[i] >= 0) {
				p += 1;
			} else {
				n += 1;
			}
		}
		System.out.println("\n");

		System.out.println("Count of positive elements in the array = " + p);
		System.out.println("Count of negative elements in the array = " + n);

	}
}