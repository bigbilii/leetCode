package LeetCode;

import java.util.Stack;

/*
 * Created by bigbilii on 17-3-21.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && !stack.isEmpty() && (char) stack.peek() == '(') {
                stack.pop();
            } else if(s.charAt(i) == '}' && !stack.isEmpty() && (char) stack.peek() == '{') {
                stack.pop();
            } else if(s.charAt(i) == ']' && !stack.isEmpty() && (char) stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }

}
