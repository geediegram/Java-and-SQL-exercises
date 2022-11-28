	
	//This is to check if the student's score is greater or less than 60
	//Prompt user for a score
	//If the score is greater than or equal to 60
	//	print "Pass"
	//If the score is less than 60
	//	print "Fail"
	
	import java.util.Scanner;
	public class CheckScore{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int score;
	
	System.out.print("Enter score: ");
	score = input.nextInt();
	
	if(score >= 60){
	System.out.println("Pass");
	}else{
	System.out.println("Fail");
	}
	
	


}

}
