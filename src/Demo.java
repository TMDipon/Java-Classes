public class Demo {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        if (isZero(b)) {
            System.out.println("Divisor cannot be zero");
        }


        return (double)a/(double)b;
    }

    private boolean isZero(int x) {
        return x == 0;
    }

    public static void print() {
        System.out.println("Hello world");
    }
}
