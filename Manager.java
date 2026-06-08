class Manager extends Employee {
    int teamSize;

    Manager(String name, String department, int teamSize) {
        super(name, department);
        this.teamSize = teamSize;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
    }
}