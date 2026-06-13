package JavaCollectionsAndStreams.Generics;

import java.util.*;

public class UpperBoundedWildcard {

    public static void display(List<? extends Number> list) {

        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Double> list2 =Arrays.asList(1.1, 2.2, 3.3);
        display(list1);
        display(list2);
    }
}