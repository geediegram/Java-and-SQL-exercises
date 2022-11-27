import java.util.Scanner;
public class ObtainerTwoPointOneFive{
	public static void main(String[] args){

	Scanner recieve = new Scanner(System.in);
	
	int firstNumber, secondNumber;
	int sum, product, difference, quotient;
	
	System.out.print("Enter first number: ");
	firstNumber = recieve.nextInt();
	
	System.out.print("Enter second number: ");
	secondNumber = recieve.nextInt();
	
	sum = firstNumber + secondNumber;
	product = firstNumber * secondNumber;
 	difference = firstNumber - secondNumber;// difference can be firstNumber - secondNumber or secondNumber - firstNumber
 	quotient = firstNumber / secondNumber;
	
	System.out.printf("Sum is %d%n", sum);
	System.out.printf("Product is %d%n", product);
 	System.out.printf("Difference is %d%n", difference);
 	System.out.printf("Quotient is %d%n", quotient);
	







	
	}


}
