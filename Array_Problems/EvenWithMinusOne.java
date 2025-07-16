// Replace all even numbers with -1
package Array_Problems;

import java.util.*;

public class EvenWithMinusOne {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Elements of the array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < t; i++) {
			if (a[i] % 2 == 0) {
				a[i] = -1;
			}

		}
		System.out.println("Elements of the array after replacing even numbers with -1:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}