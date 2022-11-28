import java.util.Scanner;
public class Compare{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int firstNumber;
	int secondNumber;
	
	System.out.println("Enter a number");
	firstNumber = input.nextInt();
	
	System.out.println("Enter a number");
	secondNumber = input.nextInt();
	
	if (firstNumber == secondNumber){
	System.out.println("These numbers are equal");
	}
	
	if (firstNumber > secondNumber){
	System.out.println("firstNumber is the largest");
	}
	
	if(secondNumber > firstNumber){
	System.out.println("SecondNumber is the largest");
	}
	
	
	
	
	}
}
