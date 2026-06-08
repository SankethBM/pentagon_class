public class Patient {
    private int pid;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.pid = patientId;
        this.name = name;
        setAge(age);
        this.medicalHistory = medicalHistory;
    }

    public int getPatientId() {
        return pid;
    }

    public String getName() {   
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}