package JavaCollectionsAndStreams.Generics;

class Box<T extends Number> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public void display() {
        System.out.println(value);
    }
}

public class BoundedTypeDemo {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<Double> b2 = new Box<>(25.5);
        b1.display();
        b2.display();
    }
}