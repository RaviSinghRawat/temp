//***************** Student Divison **************************
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	     int marks;
	     Scanner ob = new Scanner(System.in);
		System.out.println("student's marks");
		marks = ob.nextInt();
		if(marks>=60)
		{
		     System.out.println("First Divison");
		}
		else if(marks<60&&marks>44)
		{
		     System.out.println("Second Divison");
		}
		else if(marks<45&&marks>35)
		{
		     System.out.println("Third divison");
		}
		else{
		     System.out.println("Fail");
		}
	}
}