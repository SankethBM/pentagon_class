
public class Bank {
	static double bal = 500.00;
	static void withdraw(double amt) {
		if(amt <= bal) {
			System.out.println("\n"+amt+" withdraw Sucessfully !!");
			bal -= amt;
			System.out.println("\nAvailable balance : "+bal);
			
		}else {
			InsufficientBalanceException e = new InsufficientBalanceException();
			try {
				throw e;
			}catch(Exception ref) {
				System.err.println("\nException Caugth ! "+ref);
			}
		}
	}
	
	static void deposit(double amt) {
		if(amt > 0) {
			System.out.println("\nAmount Deposited Sucessfully !!");
			bal += amt;
			System.out.println("\nAvailable balance : "+bal);
		}else {
			InvalidAmountException e = new InvalidAmountException();
			try {
				throw e;
			}catch(Exception ref) {
				System.err.println("\nException Caugth ! "+ref);
			}
		}
	}
	  
	public static void main(String[] args) {
		withdraw(450.25);
		withdraw(350.0);
		deposit(500.0);
		deposit(0.0);
		withdraw(250.0);
	}
}
