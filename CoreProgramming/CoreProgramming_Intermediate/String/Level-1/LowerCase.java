import java.util.Scanner;

public class LowerCase{
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String lower1 = convertToLower(text);
        String lower2 = text.toLowerCase();
        boolean result = compareStrings(lower1, lower2);
        System.out.println("\nLowercase using user-defined method: " + lower1);
        System.out.println("Lowercase using toLowerCase(): " + lower2);
        if (result) {
            System.out.println("Both strings are same.");
        } else {
            System.out.println("Both strings are different.");
        }

       sc.close();
    }
}
    