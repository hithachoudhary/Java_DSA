// Count positive and negative numbers

package Array_Problems;

import java.util.*;

public class Count_Pos_Neg {
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
		for (int i = 0; i < t; i++) {
			if (a[i] < 0) {
				a[i] = 0;
			}
		}

		System.out.println("\n");
		System.out.println("Elements of the array when negtaive numbers are 0:");
		for (int i = 0; i < t; i++) {
			System.out.print(a[i] + " ");
		}
	}
}