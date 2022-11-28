import java.util.Scanner;
public class Multiple{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number1;
	int number2;
	
	System.out.print("Enter a number: ");
	number1 = input.nextInt();
	
	System.out.print("Enter a number: ");
	number2 = input.nextInt();
	
	if(number2 % number1 == 0)
	number2 = number1 * number1;
	System.out.println(number2);
	}
}
