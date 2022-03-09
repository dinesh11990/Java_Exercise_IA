package JavaPractise;

public class Returntypes {
	
	public int collectedAmount = 1000;
	
	public int collectAmountandGiveittome() {
		
		System.out.println("Daddy have collected Rupees " + collectedAmount + " and send it to son");
		return collectedAmount;

	}
	public static void main(String[] args) { 
		// Return Types
		
		Returntypes mySon = new Returntypes();
		int obj = mySon.collectAmountandGiveittome();
		System.out.println("got the amount from daddy " +obj);
		
	}
}
