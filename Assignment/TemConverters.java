import java.util.Scanner;
public class TemConverters{
	public static void main(String[] args){
	
	Scanner collect = new Scanner(System.in);	
	TemConverter thermo = new TemConverter();
	
	System.out.println("Enter temperature in celsius");
	double celsius = collect.nextDouble();
	double result = thermo.convertCelsiusToFahrenheit(celsius);
	System.out.println(result);
}

}
