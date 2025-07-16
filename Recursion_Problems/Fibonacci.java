package Recursion_Problems;
import java.util.Scanner;

public class Fibonacci{
	
	public static void PrintWORecursion(int n) {
		int k = 0;
		int p = 1;
		for (int i = 1 ; i<=n ;i ++) {
			if (i ==1) {
				System.out.println(0);
			}
			else if (i==2) {
				System.out.println(1);
				p = 1;
			}
			else {
				System.out.println(k+p);
				int temp = k;
				k = p;
				p = temp+p;
			}
			
		}
	}
	
	public static int PrintWRecursion(int n) {
		if (n <=1) {
			return n;
		}
		
		
		return PrintWRecursion(n-1)+PrintWRecursion(n-2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
//		System.out.println("Fibonacci Without recursion:");
//		PrintWORecursion(n);
		System.out.println("With Recursion:");
		for (int i = 0; i<n; i++) {
			System.out.println(PrintWRecursion(i));
		}



	}
}