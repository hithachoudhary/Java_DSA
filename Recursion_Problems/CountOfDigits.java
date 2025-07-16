package Recursion_Problems;
import java.util.Scanner;

public class CountOfDigits{
	
	static int c = 0;
	public static int PrintWRecursion(int n) {
		if (n>0) {
			c++;
			PrintWRecursion(n/10);
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println("With Recursion:");
		System.out.println(PrintWRecursion(n));
	}
}