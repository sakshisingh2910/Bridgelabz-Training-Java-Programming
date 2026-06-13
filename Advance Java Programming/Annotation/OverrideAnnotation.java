class A{
    public void showTheNameOfMethod(){
        System.out.println("print A show");

    }
}
class B extends A {
    @Override
    public void showTheNameOfMethod(){
        System.out.println("print B show");

    }
    
}
public class OverrideAnnotation {
    public static void main(String[] args) {
        B object = new B();
        object.showTheNameOfMethod();
        
    }
    
}
