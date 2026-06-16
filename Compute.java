public class Compute {
    static void checkNum(int a, int b) {
        if (a > b) {
            System.out.println("A is greater !!");
        } else {
            ALessThanBException e = new ALessThanBException();

            try {
                throw e;
            } catch (Exception ref) {
                System.err.println(ref+" Exception Caught !!\n"+ ref.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        checkNum(20, 100);
    }
}
