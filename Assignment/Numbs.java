import java.util.Scanner;
public class Numbs{
	public static void main(String[] args){
	
	Scanner giddy = new Scanner(System.in);
	
	System.out.printf("Guess a number \n");
	int takeAGuess = giddy.nextInt();
	int mysteryNumber = 60;
	
	if(takeAGuess == mysteryNumber){
	System.out.println("You are correct");
	}
	
	if(takeAGuess > mysteryNumber){
	System.out.println("Your number is too high");
	}
	
	if(takeAGuess < mysteryNumber){
	System.out.println("You are so so wrong");
	}	




	}



}
