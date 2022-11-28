//Write a code to find the two largest integers
//Prompt user to enter 10 numbers from 1 to 100
//Get the first largest integer
    //print "First largest integer is"
//Get the Second largest integer
    //print "Second largest integer is"

import java.util.Scanner;
public class ScoreCheckTest {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            
	    int number;		
            int largestNumber1 = 0;
            int largestNumber2 = 0;


            for(int count = 1; count <= 10; count = count +1){
                System.out.println("Enter number " + (count) + ":");
                number = input.nextInt();
                
                if(number > largestNumber1 ){
                largestNumber1 = largestNumber2;
                largestNumber1 = number;
                }
                if(number > largestNumber2 && number < largestNumber1){
                largestNumber2 = number;
                }
        }
        System.out.printf("First largest integer is %d%n", largestNumber1);
        System.out.printf("Second largest integer is %d%n", largestNumber2);
    }
    }
