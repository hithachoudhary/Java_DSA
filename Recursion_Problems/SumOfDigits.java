package Recursion_Problems;
import java.util.Scanner;

public class SumOfDigits{
	
	
	public static int PrintWRecursion(int n) {
		if (n==0) {
			return 0;
		}
		
		return n%10 + PrintWRecursion(n/=10);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println("With Recursion:");
		System.out.println(PrintWRecursion(n));
	}
}