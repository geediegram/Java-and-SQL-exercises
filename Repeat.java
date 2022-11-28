import java.util.Scanner;
public class Repeat{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int number;
	int largestNumber1 = 0;
	int largestNumber2 = 0;
	
	for(int count = 1; count <=10; count = count +1){
	System.out.println("Enter a number " + (count) + ":");
	number = input.nextInt();
	
	if(number > largestNumber1){
	largestNumber2 = largestNumber1;
	largestNumber1 = number;
	
	}else{
	
	if(number > largestNumber2 && number < largestNumber1){
	largestNumber2 = number;
	}
	}
	
	}
	System.out.printf("First largest number is %d%n", largestNumber1);
	System.out.printf("Second largest number is %d%n", largestNumber2);


}
}
