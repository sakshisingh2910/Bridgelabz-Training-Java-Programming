public class NullPointer {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
            System.out.println("You cannot access methods on a null object.");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}