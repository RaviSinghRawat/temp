//******************************Largest in four *****************************************************
import java.util.Scanner;
public class Main
{
	public static void main(String arr[]) {
	      int a,b,c,d;
	     Scanner ob = new Scanner(System.in);
		System.out.println("enter four numbers");
		
		a = ob.nextInt();
		b = ob.nextInt();
		c = ob.nextInt();
		d = ob.nextInt();
		
		if(a>b){
		     if(a>c){
		          if(a>d){
		               System.out.print("largest "+a);
		          }
		     }
		}
		else if(b>a){
		     if(b>c){
		          if(b>d){
		               System.out.print("largest "+b);
		          }
		     }
		}
		else if(c>a){
		     if(c>b){
		          if(c>d){
		               System.out.print("largest "+c);
		          }
		          else{
		             	System.out.print("largest "+d);
		          }
		     }
		}
	}
}