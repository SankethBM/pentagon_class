class Employee {
    String name;
    String department;
    int empId;

    static int counter = 1000;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.empId = ++counter;
    }

    void display() {

        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}