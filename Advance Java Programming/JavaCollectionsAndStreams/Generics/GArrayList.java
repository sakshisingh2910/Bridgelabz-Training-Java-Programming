package JavaCollectionsAndStreams.Generics;
import java.util.*;
public class GArrayList{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("SAKSHI");
        list.add("shiva");

        String str = list.get(1);
        System.out.println("element is: " +str);
        
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}