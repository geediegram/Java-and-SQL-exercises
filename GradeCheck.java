	//This is to certify StudentGrade in LASU
	//Prompt user for a score
	//If the score is greater than or equal to 90 and less than or equal to 100
	//	print "A"
	//If the score is greater than or equal to 80 and less than or equal to 89
	//	print "B"
	//If the score is greater than or equal to 70 and less than or equal to 79
	//	print "C"
	//If the score is greater than or equal to 60 and less than or equal to 69
	//	print "D"
	//If the score is less than or equal to 59
	//	print "F"
	
	import java.util.Scanner;
	public class GradeCheck{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int studentGrade;
	
	System.out.print("Enter StudentGrade: ");
	studentGrade = input.nextInt();
	
	if(studentGrade >= 90 && studentGrade <= 100)
	System.out.println("A");
	
	if(studentGrade >= 80 && studentGrade <= 89)
	System.out.println("B");
	
	if(studentGrade >= 70 && studentGrade <= 79)
	System.out.println("C");
	
	if(studentGrade >= 60 && studentGrade <= 69)
	System.out.println("D");
	
	if(studentGrade < 59)
	System.out.println("F");
	}
	
	}
