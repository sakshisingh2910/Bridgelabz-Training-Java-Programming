import java.io.FileReader;
public class checkedException{
    public static void main(String[] args) {
        try {
            FileReader file  = new FileReader ("abc.txt");
            System.out.println("file opened successfully");
        } catch (Exception e) {
            System.out.println("file not found");
        
            
        }
    }
}