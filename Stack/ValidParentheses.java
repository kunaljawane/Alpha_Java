/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

import java.util.*;

class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       
        ArrayList<Character> list = new ArrayList<>();

        list.add('(');
        list.add('[');
        list.add('{');

        for(int i=0;i<s.length();i++){

            char curr = s.charAt(i);
            
            if(list.contains(curr)){
                stack.push(curr);

            }else{

                //this will return is no starting bracket were in string 
                if (stack.isEmpty()) {
                return false;
            }
                char top = stack.pop();
                 if ((curr == ')' && top != '(') ||
                (curr == ']' && top != '[') ||
                (curr == '}' && top != '{')) {

                return false;
            }

            }
        }


        return stack.isEmpty();


    }
}