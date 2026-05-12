import java.util.Scanner;

public class ShortestLongestWord {
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
    public static int[] findShortestLongest(String[][] data) {
        int shortest = 0;
        int longest = 0;
    for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortest][1]);
            int longestLength = Integer.parseInt(data[longest][1]);
            if (currentLength < shortestLength) {
                shortest = i;
            }
            if (currentLength > longestLength) {
                longest = i;
            }
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitText(text);
        String[][] data = getWordAndLength(words);
        int[] result = findShortestLongest(data);
        System.out.println("\nWord\tLength");
        for (int i = 0; i < data.length; i++) {
        int len = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + len);
        }
        System.out.println("\nShortest Word: " +
                data[result[0]][0]);
        System.out.println("Length: " +
                data[result[0]][1]);
        System.out.println("\nLongest Word: " +
                data[result[1]][0]);
        System.out.println("Length: " +
                data[result[1]][1]);
                sc.close();
    }
}