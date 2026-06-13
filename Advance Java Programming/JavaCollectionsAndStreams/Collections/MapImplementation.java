package JavaCollectionsAndStreams.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Sakshi");
        map.put(102, "Rahul");
        map.put(103, "Aman");

        System.out.println(map);

        System.out.println(map.get(102));

        map.remove(103);

        System.out.println(map);
    }
}