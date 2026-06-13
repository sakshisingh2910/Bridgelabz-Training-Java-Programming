package JavaCollectionsAndStreams.Generics;

import java.util.*;

public class LowerBoundedWildcard {

    public static void addData(
        List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println(list);
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        addData(list1);
        addData(list2);
    }
}