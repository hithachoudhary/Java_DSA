package Recursion_Problems;
import java.util.Scanner;

public class PrintNTimes{
	
	public static void PrintWRecursion(int n) {
		if (n==0) {
			return;
		}
		System.out.println("Hello My Dear");
		PrintWRecursion(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println("With Recursion:");
		PrintWRecursion(7);



	}
}