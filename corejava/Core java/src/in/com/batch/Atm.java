package in.com.batch;

public class Atm {

	private int balance = 0;
	  
	public void SetBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposite(int amount) {
		int total = getBalance()+amount;
	   SetBalance(total);
	   System.out.println("Balance after deposite="+getBalance());
	}

	public void withdraw(int amount) {
		int total=getBalance()-amount;
		 if(total<2000) {
		 System.out.println("insufficient balance");
		 }
		 else {
			 SetBalance(total);
			 System.out.println("Balance after withdraw="+getBalance());
		 }
		 }
	
	
	
		
	
	

	

}
