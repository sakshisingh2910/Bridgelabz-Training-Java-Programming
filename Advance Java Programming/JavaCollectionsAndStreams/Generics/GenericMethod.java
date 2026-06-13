package JavaCollectionsAndStreams.Generics;
class Printer{
    <T> void print(T item){
        System.out.println("printing: " + item);
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("sakshi");
        p.print(11);
        p.print(10.070);

    }
    
}
