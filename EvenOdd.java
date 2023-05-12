//****************Even or Odd number**********************************

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	     int num;
	     Scanner ob = new Scanner(System.in);
		System.out.println("enter a number");
		num = ob.nextInt();
     if(num%2==0)
     {
          System.out.println("even");
     }
     else{
          System.out.println("odd");
     }
	}
}