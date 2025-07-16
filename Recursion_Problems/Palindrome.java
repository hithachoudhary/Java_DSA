package Recursion_Problems;
import java.util.Scanner;

public class Palindrome{
		public static int PrintWRecursion(int n, int temp) {
		if (n==0) {
			return temp;
		}
		temp = (temp*10) + (n%10);
		return PrintWRecursion(n/10, temp);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int rev = PrintWRecursion (n,0);
		System.out.println("With Recursion:");
		if (rev == n) {
			System.out.println("Yes, it is a palindrome");
		}
		else {
			System.out.println("Not a Palindrome.");
		}
	}
}