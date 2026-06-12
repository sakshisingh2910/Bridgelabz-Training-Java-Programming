class Person {

    String name;

    Person(String name) {
        this.name = name;   // this keyword
    }

    void display() {
        System.out.println("Person Name: " + name);
    }
}

class Student extends Person {

    int rollNo;

    static String college = "ABC College"; // static variable

    Student(String name, int rollNo) {
        super(name);        // super keyword
        this.rollNo = rollNo;
    }

    void showDetails() {
        super.display();    // super method

        System.out.println("Roll No: " + this.rollNo);
        System.out.println("College: " + college);
    }

    static void showCollege() {
        System.out.println("College Name: " + college);
    }
}

public class KeywordPractice {

    public static void main(String[] args) {

        Student s1 = new Student("Sakshi", 101);

        // instance method
        s1.showDetails();

        System.out.println();

        // static variable
        System.out.println("Static Variable: " + Student.college);

        // static method
        Student.showCollege();

        System.out.println();

        // instanceof
        System.out.println("s1 instanceof Student : "
                + (s1 instanceof Student));

        System.out.println("s1 instanceof Person : "
                + (s1 instanceof Person));

        System.out.println("s1 instanceof Object : "
                + (s1 instanceof Object));
    }
}