
package JavaCollectionsAndStreams.Generics;
class box{
    
    static <T> T getdata( T data){
        return data;
    }
}
public class GenericMethodwithReturnType {
    public static void main(String[] args) {
        String s =  box.getdata("Hello");
        System.out.println(s);
    }
    
}
 // method static with return type