package amruta.com;
import java.util.*;
public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] numbers = {1,2,8,9,12,46,76,82,15,20,30};

	        // Using LinkedHashMap to maintain order 1–9
	        Map<Integer, Integer> result = new LinkedHashMap<>();

	        // Initialize keys 1 to 9
	        for (int i = 1; i <= 9; i++) {
	            result.put(i, 0);
	        }

	        // Count multiples
	        for (int num : numbers) {
	            for (int i = 1; i <= 9; i++) {
	                if (num % i == 0) {
	                    result.put(i, result.get(i) + 1);
	                }
	            }
	        }

	        // Print result
	        System.out.println(result);
	    }
	


}
