import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
	
		{
		    int firstnumber, secondnumber, add, subtract, multiply;
		    float divide;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter Two Numbers : ");
		    firstnumber = scanner.nextInt();
		    secondnumber = scanner.nextInt();

		    add = firstnumber + secondnumber;
		    subtract = firstnumber - secondnumber;
		    multiply = firstnumber * secondnumber;
		    divide = (float) firstnumber / secondnumber;

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + subtract);
		    System.out.println("Multiplication = " + multiply);
		    System.out.println("Division = " + divide);
		  }
		}

	}


