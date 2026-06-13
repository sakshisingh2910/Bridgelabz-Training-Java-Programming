package JavaCollectionsAndStreams.Generics;

import java.util.*;

public class UnboundedWildcard {

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Sakshi", "Shiva");

        List<Integer> nums =
                Arrays.asList(10, 20, 30);

        printList(names);
        printList(nums);
    }
}