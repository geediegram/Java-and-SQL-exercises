import java.util.Scanner;
	public class AskUser{
	public static void main(String[] args){
		
	Scanner userInput = new Scanner(System.in);
	
	int firstNumber;
	
	System.out.println("firstNumber");
	firstNumber = userInput.nextInt();
	
	if(firstNumber == 1){
	System.out.println(0);
	}
	
	if(firstNumber == 0){
	System.out.println(1);
	}

	
	}


}
