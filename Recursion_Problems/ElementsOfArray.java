package Recursion_Problems;
import java.util.Scanner;

public class ElementsOfArray{
	
	public static void PrintWRecursion(int[] a, int n) {
		if (n !=-1) {
			PrintWRecursion(a,n-1);
			System.out.println(a[n]);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);		
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements:");
		for (int i =0; i<n;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("With Recursion:");
		PrintWRecursion(a,n-1);
	}
}