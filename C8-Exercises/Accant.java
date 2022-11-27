public class Accant{
	private String accountName;
	private double balance;
	
	
	public String getAccountName(){
	
		return accountName;
	
	}
	
	public void setBalance(double newBalance){
	 	
	 	balance = newBalance;
	
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAccountName(String newName){
		accountName = newName;
	
	
	}
	
	public void setNameAndBalance(double balance, String newName){
	this.balance = balance;
	accountName = newName;
	}

}
