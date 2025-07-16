package Recursion_Problems;
import java.util.Scanner;

public class ReverseOfANumber{
		public static void PrintWRecursion(int n) {
		if (n>0) {
			System.out.print(n%10);
			PrintWRecursion(n/10);
		}
		
		return;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println("With Recursion:");
		PrintWRecursion(n);
	}
}