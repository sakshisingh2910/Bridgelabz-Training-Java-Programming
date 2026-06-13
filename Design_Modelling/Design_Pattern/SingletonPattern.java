class Samosa {

    private static Samosa samosa;

    private Samosa() {
        System.out.println("Object Created");
    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }
}

public class SingletonPattern {

    public static void main(String[] args) {

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1);

        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2);

        System.out.println(s1 == s2);
    }
}