import java.util.ArrayList;
import java.util.List;

/*
 * Created by bigbilii on 17-3-13.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            String a = i + "";
            if(i % 3 == 0) {
                a = "Fizz";
                if(i % 5 == 0) {
                    a += "Buzz";
                }
            } else if(i % 5 == 0) {
                a = "Buzz";
            }
            list.add(a);
        }
        return list;
    }
}
