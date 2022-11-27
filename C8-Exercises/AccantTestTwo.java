public class AccantTestTwo{
	public static void main(String[] args){
	
		Accant myAccant = new Accant();
		myAccant.setNameAndBalance(50000.002478, "Dami Nkechinyere");
		
		System.out.printf("Hello %s, %nYour balance is %.3f", myAccant.getAccantName(), myAccant.getBalance);
		
		}
	}
