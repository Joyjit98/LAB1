package labassignment1;
import java.util.Scanner;

public class Squares {
	int sum;
	int perimeter=0;
	int diameter=0;
	int length=0;
	 public int calculateDifference(int x)
	 {
		 for(int i=1; i<=x; i++)
		 {
			 perimeter=perimeter+i*i;
			 length=(diameter+i);
			 length= length*length;
			 sum=perimeter-length;
		 }
		 return sum;
	 }

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n=scn.nextInt();
		Squares s= new Squares();
		System.out.println(s.calculateDifference(n));
		

	}

}
