class Owner {

    Car c = new Car();

    void drive() {
        c.start();
    }

    public static void main(String[] args) {
        Owner o = new Owner();
        o.drive();


    }
}