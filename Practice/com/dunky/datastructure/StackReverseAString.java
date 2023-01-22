package com.dunky.datastructure;

import java.util.Stack;

/**
 * Push the character one by one into the Stack of datatype character.
 * Pop the character one by one from the Stack until the stack becomes empty.
 * Add a popped element to the character array.
 * Convert character array to string.
 * Return reversed string.
 */

public class StackReverseAString {

    public static String reverse(String str){
        // base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
        Stack<Character> stack = new Stack<>();

        // push every character of the given string into the stack
        for (int i = 0; i < str.length(); ++i) {
            stack.push(str.charAt(i));
        }

        // pop characters from the stack and append them into StringBuilder
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        // convert `StringBuilder` to string and return
        return result.toString();
    }

    public static void main(String[] args){
        String str = "Reverse me directly from a stack data structure!";
        str = reverse(str);    // string is immutable
        System.out.println("The reversed string is " + str);
    }
}
