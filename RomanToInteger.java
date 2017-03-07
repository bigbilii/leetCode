/*
 * Created by bigbilii on 17-3-6.
 */
public class RomanToInteger {
    public int romanToInt(String s) {// I V X L C D M
        int outNum = 0;
        int coutrl = 1000;
        for(int i = 0; i < s.length(); i ++) {
            int aChar = RomanToInteger.toInt(s.charAt(i));
            if(coutrl < aChar) {
                outNum -= 2 * coutrl;
            }
            coutrl = aChar;
            outNum += coutrl;
        }
        return outNum;
    }

    public static int toInt(char c) {
        if(c == 'I') {
            return 1;
        }else if( c == 'V') {
            return 5;
        }else if (c == 'X') {
            return 10;
        }else if(c == 'L') {
            return 50;
        }else if(c == 'C') {
            return 100;
        }else if(c == 'D') {
            return 500;
        }else if(c == 'M') {
            return 1000;
        }else {
            return 0;
        }
    }
}
