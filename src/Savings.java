
public class Savings extends Accounts {
    //List  properties specific to the Savings accounts
private	int safetyDepositBoxID;
private	int safetyDepositkey;
	// Constructor to initialize settings for the Savings properties
	
	public Savings(String name,String ssn,double initDeposit) {
	super(name, ssn, initDeposit);
	
		accountNumber = "1" +accountNumber;
		setSafetyDepositBox();
	
		//System.out.println( "Account Number:" + this.accountNumber);
		//System.out.println( "New Savings Account");

	}
	
	@Override
	public void setRate() {
		System.out.println("Implement rate for savings");
		rate=	getBaseRate() -.25;
	}
		private void setSafetyDepositBox() {
			safetyDepositBoxID=(int)(Math.random()* Math.pow(10,3));
			safetyDepositkey=(int)(Math.random()* Math.pow(10,4));
			System.out.println("ACCOUNT TYPE: Savings");
		}
	//List any methods specific to Savings account
public void showInfo() {
	super.showInfo();
	System.out.println("Your Savings Account Features" +
	"\n Safety Deposit Box ID: " + safetyDepositBoxID+
	  "\n Safety Deposit Box Key:" + safetyDepositkey);
			
	
}

}


