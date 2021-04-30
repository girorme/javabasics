public class App {
    public static void main(String[] args) throws Exception {
        //primitives();
        //lists();
        //iteration();
        //io();
        //functional();
        //network();
        //oo();
    }

    public static void primitives() {
        int a, b = 10;
        int big = 100_000_00;
        double c = 10.10;
        short s;
        long l;
        float fl;
        int[] nums = {1, 2, 3, 4, 5};
        byte bt = 100;
        boolean bool;
        char ch;

        // Max values
        
        int i = Integer.MAX_VALUE;
        int j = i + 1;
        // j will roll over to -2_147_483_648

        double d = Double.MAX_VALUE;
        double o = d + 1;
        // o will be Infinity


        // Autoboxing
        // Java can perform this conversion for us automatically.
        // We call this process Autoboxing. Here is an example:
        Character charO = 'c';
        Integer intO = 1;
    }

    public static void lists() {
    }

    public static void iteration() {
        String[] names = {"girorme", "java"};
        
        for (String name : names ) {
            System.out.println(name);
        }
    }

    public static void io() {
        
    }

    public static void functional() {
    }

    public static void network() {

    }

    public static void oo() {

    }
}
