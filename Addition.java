import java.util.Scanner;
public class Addition{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	int sum;
	
	System.out.print("Enter first number ");
	firstNumber = input.nextInt();
	
	System.out.print("Enter second number ");
	secondNumber = input.nextInt();
	
	System.out.print("Enter third number ");
	thirdNumber = input.nextInt();
	
	//sum = firstNumber + secondNumber + thirdNumber;
	
	//System.out.printf("sum is %d%n", sum);
	
	if(firstNumber != secondNumber)
	System.out.printf("%d is !=  %d%n", firstNumber, secondNumber);
	
	if(firstNumber == secondNumber);
	System.out.printf("%d is ==  %d%n", firstNumber, secondNumber);
	
	if(firstNumber < thirdNumber)
	System.out.printf("%d is <  %d%n", firstNumber, thirdNumber);	








}

}
