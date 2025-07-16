package Recursion_Problems;
import java.util.Scanner;

public class Factorial{
	
	public static int Factorial(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		else {
			return n * Factorial (n-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println(Factorial(n)); 


	}
}