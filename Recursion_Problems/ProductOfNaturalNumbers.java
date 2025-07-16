package Recursion_Problems;
import java.util.Scanner;

public class ProductOfNaturalNumbers{
	
	public static int PrintWRecursion(int n) {
		if (n==1 ) {
			return 1;
		}
		else {
			return n * PrintWRecursion (n-1);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		System.out.println("With Recursion:");
		System.out.println(PrintWRecursion(n));
	}
}