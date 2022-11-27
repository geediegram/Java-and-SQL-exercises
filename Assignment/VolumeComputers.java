import java.util.Scanner;
public class VolumeComputers{
	public static void main(String[] args){
	
	Scanner collect = new Scanner(System.in);
	VolumeComputer vol = new VolumeComputer();
	
	
	System.out.println("Enter radius");
	double radius = collect.nextDouble();
	
	System.out.println("Enter length");
	double length = collect.nextDouble();
	
	
	
	double area = vol.computeArea(radius);
	System.out.println(area);
	
	double volume = vol.computeVolume(area, length);
	System.out.println(volume);
	
	
	
	}



}
