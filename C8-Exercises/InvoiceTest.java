public class InvoiceTest{
	public static void main(String[] args){
	
	Invoice myInvoice = new Invoice("1265B", "This is a bonnet", 35, 120);
	myInvoice.getInvoiceAmount ();
	
	double myInvoiceTotal = myInvoice.getInvoiceAmount();
	
	System.out.printf("My invoice amount is %d%n", myInvoiceTotal);
	}
	
	
	
}
