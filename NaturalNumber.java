package labassignment1;

import java.util.Scanner;

public class NaturalNumber {
	int add;
	public int calculateAdd(int x)
	{
		for(int i=1; i<=x; i++)
		{
		if(i%3==0 && i%5==0)
			add=add=i;
		}
		return add;
	}
	
	public static void main(String[] args) {
		
     Scanner scn= new Scanner(System.in);
     System.out.println("ENTER THE  NUMBER");
     int n=scn.nextInt();
     NaturalNumber n1=new NaturalNumber();
     int b=n1.calculateAdd(n);
     System.out.println(b);
     }

}
