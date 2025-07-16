// Count even and odd numbers

package Array_Problems;

import java.util.*;

public class CountOddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Elements of the array:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int even = 0;
		int odd = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
		}

		System.out.println("\n");
		System.out.println("Count of odd elements in the array = " + odd);
		System.out.println("Count of even elements in the array = " + even);

	}
}