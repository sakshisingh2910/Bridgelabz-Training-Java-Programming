package Design_Modelling.Design_Principle;

class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class Yagni {

    public static void main(String[] args) {

        Student student = new Student("Sakshi");
        student.display();
    }
}
