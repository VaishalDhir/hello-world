package greater;
import java.util.Scanner;
public class Greaterno {

	public static void main(String[] args) {
		int a, b;
		Scanner num = new Scanner(System.in);
	System.out.println("Enter first no. ");	
     a = num.nextInt();
     System.out.println("Enter second no. ");
     b = num.nextInt();
     if(a>b) {
    	 System.out.println("greater no. is "+a);
    	
     }
     else {System.out.println("greater no. is "+b);
	}
	}
}
