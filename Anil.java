import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     int hindi, maths, english, persentage, total;
	     Scanner ob = new Scanner(System.in);
		System.out.println("Enter student's marks");
		hindi = ob.nextInt();
		maths = ob.nextInt();
		english = ob.nextInt();
		total = hindi+maths+english;
		persentage = total*100/300;
		System.out.println("Total marks marks : " + total);
		System.out.println("Persentage : " + persentage);

	}
}