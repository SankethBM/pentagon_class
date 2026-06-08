public class DownCasting {
    public static void main(String[] args) {
        CP cp = new CP();
        PP pp = new PP();
        Airport a = new Airport();

        a.allowPlane(cp);
        a.allowPlane(pp);
    }
}
 