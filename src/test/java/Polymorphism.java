public class Polymorphism {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 2));
    }
}
