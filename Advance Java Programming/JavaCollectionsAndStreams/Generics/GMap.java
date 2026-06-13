package JavaCollectionsAndStreams.Generics;

import java.util.*;

public class GMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "sakshi");
        map.put(2, "shiva");
        map.put(3, "rudra");
        map.put(4, "sweta");

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> e = itr.next();

            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}