import java.util.Scanner;
public class ComparisonTwoPointOneSix{
	public static void main(String[] args){

	Scanner collect = new Scanner(System.in);
	
	int firstNumber, secondNumber;
	
	System.out.print("Enter first integer ");
	firstNumber = collect.nextInt();
	
	System.out.print("Enter second integer ");
	secondNumber = collect.nextInt();
	
	if(firstNumber > secondNumber){
	System.out.println("The first is larger ");
}

	if(secondNumber > firstNumber){
	System.out.println("The second is larger ");
	}
	
	if(firstNumber == secondNumber){
	System.out.println("These numbers are equal ");
	
	}
	
	
	
	
	
	}



}
