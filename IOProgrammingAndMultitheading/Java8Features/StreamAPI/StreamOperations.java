
import java.util.*;
import java.util.stream.*;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 5, 20, 15, 25, 20, 30, 35, 40);

        List<Integer> result = list.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .skip(1)
                .limit(4)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Result = " + result);

        long count = list.stream()
                .filter(n -> n > 15)
                .count();

        System.out.println("Count = " + count);

        boolean any = list.stream()
                .anyMatch(n -> n > 35);

        System.out.println("Any > 35 = " + any);

        boolean all = list.stream()
                .allMatch(n -> n > 0);

        System.out.println("All > 0 = " + all);

        Optional<Integer> first = list.stream()
                .filter(n -> n > 15)
                .findFirst();

        System.out.println("First = " + first.get());

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);

        Optional<Integer> max = list.stream()
                .max(Integer::compare);

        System.out.println("Max = " + max.get());

        Optional<Integer> min = list.stream()
                .min(Integer::compare);

        System.out.println("Min = " + min.get());

        System.out.println("forEach:");

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}