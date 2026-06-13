import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternClass{
    public static void main(String[] arg){
        //String regex = ab;
        Pattern pattern= Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaaab");
        boolean matches = matcher.matches();
        System.out.println("result : " + matches);
    }
}