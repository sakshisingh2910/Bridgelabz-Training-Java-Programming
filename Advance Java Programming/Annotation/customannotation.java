import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom Annotation 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

class Student {

    @MyAnnotation(value = "Java Developer")
    public void display() {
        System.out.println("Display Method");
    }
}

public class customannotation {

    public static void main(String[] args) throws Exception {

        Student student = new Student();
        Method method = student.getClass().getMethod("display");
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation Value: " + annotation.value());
        }
        student.display();
    }
}