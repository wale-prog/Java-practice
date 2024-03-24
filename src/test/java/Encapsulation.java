public class Encapsulation {

    private static int num = 9;
    private static String name = "Olawale";

    public String getName() {
        return name;
    }
    public static void setName(String name2) {
        name = name2;
    }
    public static String favorites() {
        return ("My favourite number is " + num + " and my name is " + name);
    }

}

