import java.util.Scanner;

public class TwoPointOneFive{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);
 int firstNumber, secondNumber;
 int sum, product, difference, quotient;
 
 firstNumber = userInput.nextInt();
 System.out.println("Enter firstNumber");
 
 secondNumber = userInput.nextInt(); 
 System.out.println("Enter secondNumber");
 
 sum = firstNumber + secondNumber;
 product = firstNumber * secondNumber;
 difference = firstNumber - secondNumber;
 quotient = firstNumber / secondNumber;
 
 System.out.printf("the sum is %d%n", sum);
 System.out.printf("the product is %d%n", product);
 System.out.printf("the difference is %d%n", difference);
 System.out.printf("the quotient is %d%n", quotient);
}

}
