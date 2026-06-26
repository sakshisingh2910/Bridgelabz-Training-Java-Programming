package IOProgrammingAndMultitheading.IOProgrammming;

import java.io.BufferedReader;
import java.io.FileReader;

public class ParsingCSVData {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rudra\\Desktop\\Bridgelabz-Java-Training-Programme\\IOProgrammingAndMultitheading\\IOProgrammming\\studentdetails.csv"))){
            br.readLine(); // SKIP HEADER
            String line;
            while((line = br.readLine()) != null ){
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int marks = Integer.parseInt(data[2]);
                System.out.println("Id=" + id + ", Name=" + name + ",Marks=" + marks);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
        
    }
}
