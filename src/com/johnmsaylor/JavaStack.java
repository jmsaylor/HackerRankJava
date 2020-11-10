package com.johnmsaylor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class JavaStack {

    public static void test() {
        isBalanced("[{}]");
        isBalanced("()[]{");
    }

    public static void isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        boolean result = true;

        brackets.put('[',']');
        brackets.put('{', '}');
        brackets.put('(', ')');

        for (int i = 0; i < input.length(); i++) {
            if (brackets.containsKey(input.charAt(i))) {
                stack.push(input.charAt(i));
            } else if (brackets.containsValue(input.charAt(i))) {
                if (stack.empty()) {
                    result = false;
                    continue;
                }
                char previousBracket = stack.pop();
                if (input.charAt(i) != brackets.get(previousBracket)) {
                    result = false;
                }
            }
        }

        System.out.println(result && stack.empty());
    }

}
