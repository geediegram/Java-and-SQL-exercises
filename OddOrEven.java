import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String[] args){
	Scanner toy = new Scanner(System.in);
	
	int number;
	
	System.out.println("Enter a number");
	number = toy.nextInt();
	
	if( number%2 == 0){
	System.out.println("This number is an even number");
	}else{
	System.out.println("This number is an odd number");
	}
	
	}
}
