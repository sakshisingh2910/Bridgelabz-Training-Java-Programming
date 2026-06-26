import java.util.*;
import java.util.stream.Collectors;

public class Java8FeaturesDemo {

        public static void main(String[] args) {

        // ==========================
        // 1. GENERICS
        // ==========================
        List<String> names = new ArrayList<>();

        names.add("Sakshi");
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");

        System.out.println("Original Names:");
        System.out.println(names);

        // ==========================
        // 2. LAMBDA EXPRESSION
        // ==========================
        System.out.println("\nUsing Lambda Expression:");

        names.forEach(name -> System.out.println(name));

        // ==========================
        // 3. JAVA 8 COLLECTION METHODS
        // ==========================

        // sort()
        names.sort((a, b) -> a.compareTo(b));

        System.out.println("\nAfter Sorting:");
        System.out.println(names);

        // replaceAll()
        names.replaceAll(name -> name.toUpperCase());

        System.out.println("\nAfter replaceAll:");
        System.out.println(names);

        // removeIf()
        names.removeIf(name -> name.startsWith("A"));

        System.out.println("\nAfter removeIf:");
        System.out.println(names);

        // ==========================
        // 4. STREAM API
        // ==========================

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        System.out.println("\nOriginal Numbers:");
        System.out.println(numbers);

        // filter()
        List<Integer> filtered =
                numbers.stream()
                        .filter(n -> n > 30)
                        .collect(Collectors.toList());

        System.out.println("\nNumbers Greater Than 30:");
        System.out.println(filtered);

        // map()
        List<Integer> squares =
                numbers.stream()
                       .map(n -> n * n)
                        .collect(Collectors.toList());

        System.out.println("\nSquares:");
        System.out.println(squares);

        // count()
        long count =
                numbers.stream()
                        .filter(n -> n > 30)
                        .count();

        System.out.println("\nCount > 30 : " + count);

        // sorted()
        List<Integer> sorted =
                numbers.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

        System.out.println("\nReverse Sorted:");
        System.out.println(sorted);

        // ==========================
        // 5. STREAM + LAMBDA
        // ==========================

        System.out.println("\nEven Numbers:");

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        // ==========================
        // 6. MAX & MIN
        // ==========================

        int max =
                numbers.stream()
                        .max(Integer::compare)
                        .get();

        int min =
                numbers.stream()
                        .min(Integer::compare)
                        .get();

        System.out.println("\nMaximum Number: " + max);
        System.out.println("Minimum Number: " + min);

        // ==========================
        // 7. SUM
        // ==========================

        int sum =
                numbers.stream()
                        .reduce(0, (a, b) -> a + b);

        System.out.println("\nSum = " + sum);
}
}