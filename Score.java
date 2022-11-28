	
	//This is to check if the student's grade is greater or less than 60
	//Collect input from user
	//If the score is greater than 60, print pass
	//If the score is less than 60, print fail
	
	import java.util.Scanner;
	public class CheckScore{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int number;
	
	System.out.print("Enter number: ");
	number = input.nextInt();
	
	if(number >= 60)
	System.out.println("Pass");
	
	if(number < 60)
	System.out.println("Fail");
	
	


}

}
