class Developer extends Employee {
    String progLang;

    Developer(String name, String department, String progLang) {
        super(name, department);
        this.progLang = progLang;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Prog Lang: " + progLang);
    }
}