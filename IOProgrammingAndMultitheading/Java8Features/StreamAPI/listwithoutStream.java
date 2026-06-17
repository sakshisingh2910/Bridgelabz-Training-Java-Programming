import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listwithoutStream{
    public static void main(String[] args) {
        List<Integer> nums  = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> listEven = new ArrayList<>();
        for(Integer i: nums){
            if(i%2==0){
                listEven.add(i);
                
                
            }
        }
        System.out.println(nums);
        System.out.println(listEven);
    }
}

