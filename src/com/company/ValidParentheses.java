package com.simon.algorithm;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){

        String s = "{{}}([])";
        ValidParentheses vp = new ValidParentheses();

        System.out.println(vp.isValid(s));
    }
    private HashMap<Character,Character> mappings;
    public ValidParentheses(){
        mappings = new HashMap<Character,Character>();
        mappings.put(')','(');
        mappings.put(']','[');
        mappings.put('}','{');
    }
    public   boolean isValid(String s) {
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }
}
