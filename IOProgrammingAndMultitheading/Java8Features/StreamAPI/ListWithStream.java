import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListWithStream {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(23,567,12,677,24);
        Stream<Integer> stream = l1.stream();
        List<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        // single line me bhi likh sakte hai
       // List<Integer> newList = l1.stream().filter(i -> i %2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        


    }
    
}

