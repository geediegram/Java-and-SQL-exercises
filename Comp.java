import java.util.Scanner;
public class Comp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	int sum;
	int average;
	int product;
	
	
	
	System.out.print("Enter first number");
	firstNumber = input.nextInt();
	
	System.out.print("Enter second number");
	secondNumber = input.nextInt();
	
	System.out.print("Enter third number");
	thirdNumber = input.nextInt();
	
	sum = (firstNumber + secondNumber + thirdNumber);
	average = (firstNumber + secondNumber + thirdNumber) /3;
	product = (firstNumber * secondNumber * thirdNumber);
	
	
	
	if(firstNumber < secondNumber){
	System.out.println("firstNumber is the smallest");
	}
	if(firstNumber > secondNumber){
	System.out.println("firstNumber is the largest");
	}
	
	System.out.printf("Sum is d%%n", sum);
	System.out.printf("Average is d%%n", average);
	System.out.printf("Product is d%%n", product);
	
	
	
	
	
	
	}

}
