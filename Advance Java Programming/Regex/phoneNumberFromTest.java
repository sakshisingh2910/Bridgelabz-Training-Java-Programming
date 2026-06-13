import java.util.regex.*;
public class phoneNumberFromTest{
    public static void main(String[] args) {
        String text =  " call me at 9367322822 . office: 9450544322";
        Pattern pattern = Pattern.compile("\\b\\d{10}\\b");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}