public class Example {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        String name = encapsulation.getName();
        System.out.println(name);
        System.out.println(Encapsulation.favorites());
        Encapsulation.setName("Raymond");
        String name1 = encapsulation.getName();
        System.out.println(Encapsulation.favorites());
        System.out.println(name1);
    }
}
