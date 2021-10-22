package labassignment1;

import java.util.Scanner;

public class Cubes {
	int sum;
	int dy;
 public int sumOfCube(int x)
 {
	 for(int i=1; i<=x; i++)
	 {
		 sum=sum+i*i*i;
	 }
	 return sum;
 }
	public static void main(String[] args) 
	{
	Scanner scn= new Scanner(System.in);
	System.out.println("ENTER A NUMBER");
	int n=scn.nextInt();
	Cubes s= new Cubes();
	System.out.println(s.sumOfCube(n));
		}

}
