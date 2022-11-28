import java.util.Scanner;
public class ScoreCheckTwo {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int score;
            int totalScore = 0;


            for(int count = 0; count < 50; count = count +1){
                System.out.println("Enter Student Score: ");
                score = input.nextInt();
                totalScore = totalScore + score ;
            }

            double averageScore = totalScore * 1.0/50;
            System.out.printf("totalScore is %d%n", totalScore);
            System.out.printf("average score is %f%n", averageScore);

        }
    }
