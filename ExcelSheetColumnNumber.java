/*
 * Created by bigbilii on 17-3-12.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if(s.length() == 0 || s == null) {
            return 0;
        }
        int num = 0;
        for(int i = 0; i < s.length(); i ++) {
            num *= 26;
            num += s.charAt(i) - 64;
        }
        return num;
    }
}
