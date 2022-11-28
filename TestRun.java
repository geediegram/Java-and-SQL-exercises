import java.util.Scanner;
public class TestRun{
 	public static void main(String[] args){
 	Scanner tife = new Scanner(System.in);
 	
 	
 	int number1;
 	int number2;
 	int sum;
 	int product;
 	int difference;
 	int quotient;
 	
 	System.out.println("Enter a number");
 	number1 = tife.nextInt();
 	
 	System.out.println("Enter a number");
 	number2 = tife.nextInt();
 	
 	sum = (number1 + number2);
 	product = (number1 * number2);
 	difference = (number1 - number2); // can also be number2 - number1
 	quotient = (number1 / number2);//can also be number2 / number1
 	
 	System.out.printf("sum is %d%n", sum);
 	System.out.printf("product is %d%n", product);
 	System.out.printf("difference is %d%n", difference);
 	System.out.printf("quotient is %d%n", quotient);
 	
 	}
}
