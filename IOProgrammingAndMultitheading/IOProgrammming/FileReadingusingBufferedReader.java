package IOProgrammingAndMultitheading.IOProgrammming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingusingBufferedReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rudra\\Desktop\\Bridgelabz-Java-Training-Programme\\IOProgrammingAndMultitheading\\IOProgrammming\\student.csv";
        String line;
        try(BufferedReader br  = new BufferedReader(new FileReader(filePath))){
            while((line =br.readLine()) != null){
                // System.out.println(line); output cooma ke saath print hoga esse 
                String[] data = line.split(",");

                for(String values : data){
                    System.out.println(values + " ");
                }

                // System.out.println("ID: " + data[0]);
                // System.out.println("Name: " + data[1]);
                // System.out.println("Age: " + data[2]);

                System.out.println(); // aallg aalg line ke liye 
                //System.out.print(); // ek hi line me chahiye tb use krna hai 

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
