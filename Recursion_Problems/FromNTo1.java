package Recursion_Problems;
import java.util.Scanner;

public class FromNTo1{
	
	public static void PrintWRecursion(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		PrintWRecursion(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println("With Recursion:");
		PrintWRecursion(7);

	}
}