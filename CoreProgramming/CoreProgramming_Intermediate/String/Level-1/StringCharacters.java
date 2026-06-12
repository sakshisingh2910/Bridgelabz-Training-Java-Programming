import java.util.Scanner;

public class StringCharacters {
    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] arr1 = getCharacters(text);
        char[] arr2 = text.toCharArray();
        boolean result = compareArrays(arr1, arr2);
        System.out.println("\nCharacters using user-defined method:");

        for (char ch : arr1) {
            System.out.print(ch + " ");
        }
        System.out.println("\n\nCharacters using toCharArray():");
        for (char ch : arr2) {
            System.out.print(ch + " ");
        }
        System.out.println("\n");
        if (result) {
            System.out.println("Both character arrays are same.");
        } else {
            System.out.println("Both character arrays are different.");
        }
        sc.close();
    }
}