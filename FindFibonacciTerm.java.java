package exercise3;

import java.util.Scanner;

public class FindFibonacciTerm {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the term: ");
		int n=scn.nextInt();
		
		if(fibb(n)==0)
			System.out.println("Invalid input");
		else {
			System.out.println(fibb(n));
		}

	}
	
	public static int fibb(int n)
    {
        int a = 1, b = 1, c;
        if(n==0)
        	return 0;
        if (n == 1 || n==2)
            return a;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}