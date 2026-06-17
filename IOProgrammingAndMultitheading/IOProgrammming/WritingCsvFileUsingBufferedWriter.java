package IOProgrammingAndMultitheading.IOProgrammming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class WritingCsvFileUsingBufferedWriter {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rudra\\Desktop\\Bridgelabz-Java-Training-Programme\\IOProgrammingAndMultitheading\\IOProgrammming\\student.csvv"));
            bw.write("id, name, age");
            bw.newLine();
            bw.write("1,sak, 99");
            bw.newLine();
            bw.write("2, ak,98");
            bw.newLine();
            bw.write("3,shiva, 100");
            System.out.println("csv file written successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
