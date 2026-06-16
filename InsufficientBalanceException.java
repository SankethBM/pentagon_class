
public class InsufficientBalanceException extends Exception {
	@Override
	public String getMessage() {
		return "Your Account balance is Insufficient for Withdrawl !";
	}
}
