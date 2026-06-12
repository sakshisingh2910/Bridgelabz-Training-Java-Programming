import java.util.Scanner;

public class WordLength2DArray {
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

    
    public static String[][] getWordAndLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitText(text);
        String[][] result = getWordAndLength(words);
        System.out.println("\nWord\tLength");
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + len);
        }

        sc.close();
    }
}