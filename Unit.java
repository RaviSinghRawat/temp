//*************************** Ashok gehlot bijli yojna***********************************
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     int unit;
	     Scanner ob = new Scanner(System.in);
		System.out.println("Enter unit for using");
		unit = ob.nextInt();
          if(unit<=50)
          {
		System.out.println("tumara bil maaf kiya jata hai apka ashok gehlot");

          } 
        
          else if(unit>=50 && unit<=200)
          {
               unit = 5*unit;
		System.out.println("bhai 5 rupay unit ke hisab se lagenge" + unit);

          }  
          else if(unit>200 && unit <=500)
          {
               unit = 8*unit;
		System.out.println("bhai 8 rupay unit ke hisab se lagenge" + unit);

          }
          else{
               unit = 10*unit;
		System.out.println("bhai 10 rupay unit ke hisab se lagenge" + unit);

          }
	}
}