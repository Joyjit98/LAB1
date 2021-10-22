package labassignment1;
 import java.util.Scanner;
 
public class Power {
	public boolean checkNumber(int n)
	{
      while(n%2==0)
      {
    	  n=n/2;
      }
      if(n==1)
      return true;
      else
      return false;
	}
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n=scn.nextInt();
		Power p = new Power();
		boolean r= p.checkNumber(n);
		if(r==true)
		System.out.println("THE NUMBER IS POWER OF 2");
		else
			System.out.println("THE NUMBER IS NOT POWER OF 2");
			

	}

}
