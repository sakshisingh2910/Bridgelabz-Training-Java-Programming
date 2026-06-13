package JavaCollectionsAndStreams.Generics;
class Box<T>{
    T data;
    Box(T data){
        this.data = data;
    }

    // public void show(){
    //     System.out.println(data);
    // }
}
public class GenericClass{
    public static void main(String[] args) {
        Box<String> b1= new Box<>("hello");
        System.out.println(b1.data);
        // b1.show();
        Box<Integer> b2 = new Box<>(100);
        System.out.println(b2.data);
        // b2.show();

    }
}