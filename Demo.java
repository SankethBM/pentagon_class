public class Demo {
    int a, b;
    static int x,y;

    Demo(){
        a=10; b=20;
        x=100; y=200;
    }

    static{
        // Demo d1 = new Demo();
        // System.out.println(d1.a+" "+d1.b);
        // System.out.println(x+" "+y);

        Demo d1 = new Demo();
        d1.a=30; d1.b=40;
        Demo.x=300; Demo.y=400;
        System.out.println(d1.a+" "+d1.b);
        System.out.println(Demo.x+" "+Demo.y);
    }

    {
        a=50; b=60;
        x=500;y=600;
        System.out.println(a+" "+b);
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.a+" "+d.b);
        System.out.println(Demo.x+" "+y);
    }
}
