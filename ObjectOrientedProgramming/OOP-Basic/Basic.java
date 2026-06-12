class Student {

    // Instance Variables (har object ki alag copy)
    private String name;
    private int age;

    // Class Variable (sab objects share karenge)
    static String college = "GLA University";

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance Method
    public void displayStudent() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("College : " + college);
    }

    // Static Method
    public static void displayCollege() {
        System.out.println("College Name : " + college);
    }
}

public class Basic {

    public static void main(String[] args) {

        // Objects
        Student s1 = new Student("Sakshi", 21);
        Student s2 = new Student("Rahul", 22);

        // Instance Method Call
        s1.displayStudent();

        System.out.println();

        s2.displayStudent();

        System.out.println();

        // Static Method Call
        Student.displayCollege();
    }
}