import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //filter
        List<String> names = List.of("Abhi", "Ajeet", "Anoop", "Sakshi");
        List<String> NewNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(NewNames);

        // map
        List<Integer> Numbers = List.of(2, 4, 3, 5, 6);
        List<Integer> NewNumbers = Numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(NewNumbers);

        //min 
        Integer integer = Numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(integer);

        //max
        Integer integer1 = Numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println(integer1);


    }
}
