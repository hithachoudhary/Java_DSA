package Recursion_Problems;
import java.util.Scanner;

public class Print1ToN{
	
	public static void PrintWRecursion(int start, int n) {
		if (start==n+1) {
			return;
		}
		System.out.println(start);
		start+=1;
		PrintWRecursion(start,n);
	}
	public static void main(String[] args) {
		System.out.println("With Recursion:");
		PrintWRecursion(1,7);



	}
}