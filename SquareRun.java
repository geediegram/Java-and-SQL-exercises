import java.util.Scanner;

public class SquareRun{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int square = 1;
        int number;
        
        int counter = 1;
        while(counter <= 10){
        System.out.print("Enter score: ");
        number = input.nextInt();
        
        square = number * number;
        System.out.printf("%d%n", square);
        counter++;
               
}

	//System.out.printf("%d%n", square);
    }
    }
