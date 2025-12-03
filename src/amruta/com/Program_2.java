package amruta.com;
import java.util.*;
public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner abc = new Scanner(System.in);
        System.out.print("Enter value of a (integer): ");
        int a = abc.nextInt();

        System.out.print("Output: ");

        // Generate and print first 'a' odd numbers
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1;   // formula for ith odd number
            System.out.print(oddNumber);

            if (i < a) {
                System.out.print(", ");  // add comma except last number
            }
        }

        abc.close();
    }

	

}
