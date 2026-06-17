import java.util.stream.Stream;

public class ObjectStream {
    public static void main(String[] args) {

        //object creation with emptystream
        Stream<Object> emptyStream = Stream.empty();
        // emptyStream.forEach(e -> {
        //     System.out.println(e);
        // });

        //2 way array se stream.of use krke stream object create kr sakte hai
        String names[] = {"sakshi", "sweta", "rudra","ranveer"};
        Stream<String> Stream1 = Stream.of(names);
        Stream1.forEach(e ->{
            System.out.println(e);
        });

        //3 - builder pattern use kr skate hai 


    }
    
}
