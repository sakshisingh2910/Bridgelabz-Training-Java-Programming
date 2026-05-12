import java.util.Scanner;

public class SplitText {
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
    public static String[] splitText(String text) {
        int length = findLength(text);
        int words = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        String[] result = new String[words];
        String word = "";
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
            word = word + ch;
            } else {
            result[index] = word;
                index++;
                word = "";
            }
        }
        result[index] = word;
        return result;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");
        boolean result = compareArrays(arr1, arr2);
        System.out.println("\nWords using user-defined method:");
        for (String word : arr1) {
            System.out.println(word);
        }
        System.out.println("\nWords using split() method:");
        for (String word : arr2) {
            System.out.println(word);
        }
        if (result) {
            System.out.println("\nBoth arrays are same.");
        } else {
            System.out.println("\nBoth arrays are different.");
        }

        sc.close();
    }
}