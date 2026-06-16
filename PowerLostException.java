
public class PowerLostException extends Exception {
	@Override
	public String getMessage() {
		return "Power Supply Lost !! \n\tSwitching to BackUp !";
	}
}
