
public class Checking  extends Accounts {
	//List properties specific to a checking account
 private int debitCardnumber;
 private int debitCardpin;
//Constructor to initialize Checking account properties

public Checking(String name, String sSN, double initDeposit) {
super(name, sSN, initDeposit);
accountNumber = "2" +accountNumber;
setDebitCard();
}
@Override
public void setRate() {
	//System.out.println("Implement rate for Checking");
  rate=	getBaseRate() *.15;
}
//System.out.println( "Account Number:" + this.accountNumber);
//System.out.println( "New Checking Account");
private void setDebitCard() {
	debitCardnumber =(int)(Math.random()* Math.pow(10,3));
	debitCardpin=(int)(Math.random()* Math.pow(10,4));
	//System.out.println("card:" + this.debitCardnumber);
	//System.out.println("PIN:" + this.debitCardpin);
}


	//List any methods specific to the checking account
	    public void showInfo() {
		super.showInfo();
		
		System.out.println("Your Checking Account Features" +
		"\n Debit Card Number:" + debitCardnumber+
		"\n Debit Card Pin:" + debitCardpin
		);
	}
	   
}


