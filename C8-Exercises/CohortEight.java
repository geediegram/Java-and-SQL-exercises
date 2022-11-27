import java.util.Scanner;
public class CohortEight{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int number1, number2, number3;
	
	System.out.print("Enter first integer");
	number1 = input.nextInt();
	
	System.out.print("Enter second integer");
	number2 = input.nextInt();
	
	System.out.print("Enter third integer");
	number3 = input.nextInt();
	
	int number4 = number1 + ((4 - 1) * (number2 - number1));
	
	System.out.println(number4 + " is the number4");
	
	
	
	
	
	
	
	
	


	
	}

}
