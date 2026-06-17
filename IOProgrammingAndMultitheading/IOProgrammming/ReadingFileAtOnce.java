package IOProgrammingAndMultitheading.IOProgrammming;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class ReadingFileAtOnce {
    public static void main(String[] args)  throws Exception{
        List<String> lines = Files.readAllLines(Paths.get("IOProgrammingAndMultitheading/IOProgrammming/student.csv"));
        
        //Ye List ki har line ko ek-ek karke read karega.
        for(String line :lines){
            String[] values= line.split(",");

        //Array ke har element ko read karega.
            for(String V: values){
                System.out.print(V + " "); 
            }
            System.out.println();

        }
        
    }
    
}
