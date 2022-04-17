import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Accounts> accounts = new LinkedList<Accounts>();
	/*	  Checking chekacc1 =new Checking("Madhuri","123456789", 90000);
		  Savings   savacc1 =new Savings("Sudha","634899756",80000);
		 
		  savacc1.showInfo();
		  System.out.println("*************");
		  chekacc1.showInfo();
		  */
		  
		// Read a CSV file then create new accounts based on the data
	          String file =("C:\\Users\\SudhaPotla\\eclipse-workspace\\NewRead.csv");
         List<String[]> newAccountHolder =utilities.CSV.read(file);
         for (String [] accountHolder: newAccountHolder) {
        	 //System.out.println("NEW ACCOUNT");
        	 String name= accountHolder[0];
        	 String sSN= accountHolder[1];
        	 String accountType=accountHolder[2];
        	 double initDeposit = Double.parseDouble(accountHolder[3]);
        	
        	 /*System.out.println(accountHolder[0]);
        	 System.out.println(accountHolder[1]);
        	 System.out.println(accountHolder[2]);
        	 System.out.println(accountHolder[3]);
        	 */
        	 System.out.println(name + " " +sSN + "" + accountType + "$" +initDeposit);
        	 if(accountType.equals("Savings")) {
        		 //System.out.println("OPEN A SAVINGS ACCOUNT");
        		 accounts.add( new Savings(name,sSN,initDeposit));
        	 }
        	 else if(accountType.equals("Checking")){
        		 //System.out.println("OPEN A CHECKING ACCOUNT");
        		 accounts.add( new Checking(name,sSN,initDeposit));
        	 }
        	 else {
        		 System.out.println("ERROR READING ACCOUNT TYPE");
        	 }
	}
         
//accounts.get(5).showInfo();
         for (Accounts acc : accounts) {
        	 System.out.println("\n*************");
         }
}
}
