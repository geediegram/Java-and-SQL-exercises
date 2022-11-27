public class Invoice{
	
	private String partNumber;
	private String partDescription;
	private int quantityPurchased;
	private double itemPerPrice;

	public Invoice (String partNumber, String partDescription, int quantityPurchased, double itemPerPrice ){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantityPurchased = quantityPurchased;
		this.itemPerPrice = itemPerPrice;
	}
	
	
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	public String getPartNumber(){
		return partNumber;
	}
	
	
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}
	public String getPartDescription(){
		return partDescription;
	}


	public void setQuantityPurchased(int quantityPurchased){
		this.quantityPurchased = quantityPurchased;
	}
	public int getQuantityPurchased(){
		return quantityPurchased;
	}
	
	public void setItemPerPrice(double itemPerPrice){
		this.itemPerPrice = itemPerPrice;
	}
	public double getItemPerPrice(){
		return itemPerPrice;
	}
	
	public double getInvoiceAmount(){
		return quantityPurchased * itemPerPrice;
	}
	
	
	
	
}	
