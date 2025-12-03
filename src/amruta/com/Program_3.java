package amruta.com;
import java.util.*;
public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner abc = new Scanner(System.in);

	       
	        System.out.print("Enter value of a (integer): ");
	        int a = abc.nextInt();

	        int count;

	        if (a % 2 == 0) {
	            count = a - 1;   // for even input, print a-1 odd numbers
	        } else {
	            count = a;       // for odd input, print a odd numbers
	        }

	        System.out.print("Output: ");

	        // Generate odd numbers using formula: 2*i - 1
	        for (int i = 1; i <= count; i++) {
	            int odd = 2 * i - 1;
	            System.out.print(odd);

	            if (i < count) {
	                System.out.print(", ");
	            }
	        }

	        abc.close();
	    }
	
	}


