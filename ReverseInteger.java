/*
 * Created by bigbilii on 2017/1/13.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int rex = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRex = rex * 10 + tail;
            if((newRex - tail) / 10 != rex) {
                return 0;
            }
            rex = newRex;
            x /= 10;
        }
        return rex;
    }
}
