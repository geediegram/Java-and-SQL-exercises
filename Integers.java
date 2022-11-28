import java.util.Scanner;
public class Integers{
	public static void main(String[] args){
	Scanner demo = new Scanner(System.in);
	
	int number1, number2, number3, number4, number5, smallestNumber, largestNumber;
	
	System.out.println("Enter a number");
	number1 = demo.nextInt();
	
	System.out.println("Enter a number");
	number2 = demo.nextInt();
	
	System.out.println("Enter a number");
	number3 = demo.nextInt();
	
	System.out.println("Enter a number");
	number4 = demo.nextInt();
	
	System.out.println("Enter a number");
	number5 = demo.nextInt();
	
	if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5 ){
	smallestNumber = number1;
	System.out.printf("%d is the smallest number", number1);
	}
	}
}
