import java.util.Scanner;
public class CalculateAreaDiameterCircum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int diameter;
	int area;
	int circumference;
	int radius;
	
	double pi = 3.14159;
	int pii = (int) (3.14159);
	
	System.out.println("Enter radius");
	radius = input.nextInt();
	
	
	//diameter
	System.out.printf("Diameter is %d%n", 2 * (radius * radius));
	
	//circumference
	System.out.printf("Cicumference is %d%n",  2 * (pii * radius));
	
	//area
	System.out.printf("Area is %d%n", pii * (radius * radius));
	}
}
