package Recursion_Problems;
import java.util.Scanner;

public class EvenNumbers{
	
	public static void PrintWORecursion(int n) {
		for (int i = 2 ; i<=n ;i ++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}	
	}
	
	public static int PrintWRecursion(int n) {
		if (n == 2) {
			return 2;
		}
		
		if (n%2 == 0) {
			return n;
		}
		return PrintWRecursion(n-1);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		System.out.println("Without recursion:");
		PrintWORecursion(n);
		System.out.println("With Recursion:");
		for (int i = 2; i<n; i++) {
			System.out.println(PrintWRecursion(i));
		}
	}
}