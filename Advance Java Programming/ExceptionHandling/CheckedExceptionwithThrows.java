import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedExceptionwithThrows {
    public  static void openFile() throws FileNotFoundException{
        FileReader file = new FileReader("abc.text");
        System.out.println("file opened successfully");

    }
    public static void main(String[] args) {
        try{
            openFile();
        }
        catch(FileNotFoundException e){
            System.out.println("file not opened");
        }
    }
    
}
