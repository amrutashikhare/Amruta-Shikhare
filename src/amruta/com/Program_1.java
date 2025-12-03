package amruta.com;
import java.util.*;

		class Calculator {

		    double a;
		    double b;

		
		    public Calculator(double a, double b) {
		        this.a = a;
		        this.b = b;
		    }

		   
		    public double add() {
		        return a + b;
		    }

		
		    public double subtract() {
		        return a - b;
		    }

		   
		    public double multiply() {
		        return a * b;
		    }

		    // Division (checks division by zero)
		    public Double divide() {
		        if (b == 0) {
		            return null; // returning null if divide by zero
		        }
		        return a / b;
		    }
		}

		public class Program_1 {

			public static void main(String[] args) {
				
		        // Taking inputs from user
				Scanner abc=new Scanner(System.in);
		        System.out.print("Enter value of a (double): ");
		        double a = abc.nextDouble();

		        System.out.print("Enter value of b (double): ");
		        double b = abc.nextDouble();

		        abc.nextLine(); // clear buffer

		        System.out.print("Enter type of operation (add, sub, mul, div): ");
		        String op2 = abc.nextLine().toLowerCase().trim();

		        // Create object of Calculator class
		        Calculator calc = new Calculator(a, b);

		        // Perform operation based on input
		        switch (op2) {
		            case "add":
		                System.out.println("Result = " + calc.add());
		                break;

		            case "sub":
		                System.out.println("Result = " + calc.subtract());
		                break;

		            case "mul":
		                System.out.println("Result = " + calc.multiply());
		                break;

		            case "div":
		                Double result = calc.divide();
		                if (result == null) {
		                    System.out.println("Error: Cannot divide by zero!");
		                } else {
		                    System.out.println("Result = " + result);
		                }
		                break;

		            default:
		                System.out.println("Invalid operation! Please use add/sub/mul/div");
		        }

		        abc.close();
		    }
		
	
	
	

}
