@Deprecated
class Old{
    void display(){
        System.out.println("old class");
    }
}
public class DeprecatedAnnotation {
    public static void main(String[] args) {
        Old object = new Old(); //warning yeha pe aayegi
        object.display();

    }
    
}

// output old class aayega