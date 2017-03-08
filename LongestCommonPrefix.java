/*
 * Created by bigbilii on 17-3-8.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String comminPrefix = strs[0];// abc  babc dfjlk
        for(String s: strs) {
            while(s.indexOf(comminPrefix) != 0) {
                comminPrefix = comminPrefix.substring(0,comminPrefix.length() - 1);
            }
        }
        return comminPrefix;

    }
}
