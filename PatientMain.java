public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "sanketh", 25, "Cold");
        Patient p2 = new Patient(2, "zaid", 40, "Fever");

        System.out.println();
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();

        System.out.println();
        p1.setAge(30);

        System.out.println();
        p1.displayInfo();

        System.out.println();
        p2.setAge(160);
        System.out.println();
        p2.displayInfo();
    }
}
