
public class PentClass {

	static void isPower(boolean b) {
		if (b) {
			System.out.println("Class is Runnung !!");
		} else {
			PowerLostException e = new PowerLostException();
			try {
				throw e;
			} catch (Exception ref) {
				System.err.println(ref);
			}
		}
	}

	public static void main(String[] args) {
		isPower(false);
		isPower(true);
	}
}
