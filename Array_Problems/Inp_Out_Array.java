// Input and output elements of an array
package Array_Problems;

import java.util.*;

public class Inp_Out_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Elements of the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}