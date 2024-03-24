public class Inheritance extends Encapsulation{

    public static void main(String[] args) {
        System.out.println(favorites());
        setName("Beneth");
        System.out.println(favorites());
//        favorites();
    }
    public static String favorites() {
        return "This method has been overridden";
    }
}
