package exercise3;

import java.util.Scanner;

public class FindNumberFromFibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number to find the number from fibonacci series: ");
		int n= scn.nextInt();
		if(fibb(n)==0)
			System.out.println("Invalid input.");
		else {
			System.out.println(fibb(n));
		}

	}
	
	public static int fibb(int n) {
		if(n==0)
			return 0;
		if(n<=2)
			return 1;
		return fibb(n-1)+fibb(n-2);
	}

}