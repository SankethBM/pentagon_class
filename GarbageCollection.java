public class GarbageCollection {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("\n" + this + " object is deleted!");
    }

    public static void main(String[] args) throws InterruptedException {
        GarbageCollection d = new GarbageCollection();
        System.out.println("");
        System.out.println(d);

        GarbageCollection d1 = new GarbageCollection();
        System.out.println(d1);

        d = d1;
        // d = null;
        System.out.println("\n" + new GarbageCollection());

        System.out.println("\n" + d + "\n" + d1);

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.gc();
        }

    }
}
