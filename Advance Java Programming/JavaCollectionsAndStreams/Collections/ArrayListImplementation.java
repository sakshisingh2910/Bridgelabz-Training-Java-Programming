package JavaCollectionsAndStreams.Collections;
import java.util.ArrayList;

public class ArrayListImplementation {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        System.out.println("First Element: " + list.get(0));

        list.remove("Python");

        System.out.println(list);
    }
}