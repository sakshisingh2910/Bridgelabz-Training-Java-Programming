import java.util.Scanner;

public class StringLength {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int length1 = findLength(text);
        int length2 = text.length();
        System.out.println("\nLength using user-defined method: " + length1);
        System.out.println("Length using length() method: " + length2);

        sc.close();
    } 
}