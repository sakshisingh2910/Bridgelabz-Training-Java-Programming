package IOProgrammingAndMultitheading.IOProgrammming;

import java.io.FileWriter;
import java.io.IOException;

public class DataValidationExample {

    public static void main(String[] args) {

        int id = 1;
        String name = "Sakshi";
        int marks = 90;

        try {

            if (id <= 0) {
                System.out.println("Invalid Id");
                return;
            }

            if (name == null || name.trim().isEmpty()) {
                System.out.println("Invalid Name");
                return;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks");
                return;
            }

            FileWriter fw = new FileWriter("students.csv");

            fw.write("Id,Name,Marks\n");
            fw.write(id + "," + name + "," + marks);

            fw.close();

            System.out.println("Data Written Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}