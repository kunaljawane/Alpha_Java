/*
150. Evaluate Reverse Polish Notation

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.


 */

import java.util.*;

class ReversePolishNotation {
    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        //this while idea is if you encounter a operator then remove last two and do operation and 
        //and not then keep pushing unitll found operator 
        for (int i = 0; i < tokens.length; i++) {

            String curr = tokens[i];

            if (list.contains(curr)) {

                int second = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());

                int res = 0;

                if (curr.equals("+")) {
                    res = first + second;
                }

                if (curr.equals("-")) {
                    res = first - second;
                }

                if (curr.equals("*")) {
                    res = first * second;
                }

                if (curr.equals("/")) {
                    res = first / second;
                }

                stack.push(String.valueOf(res));

            } else {
                stack.push(curr);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}