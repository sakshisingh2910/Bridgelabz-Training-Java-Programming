package JavaCollectionsAndStreams.Collections;

import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);

        list.removeFirst();

        System.out.println(list);
    }
}