/*

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

*/

class Solution {

    // This method takes a Roman numeral string and returns its integer value
    public int romanToInt(String s) {

        // This variable will store the final answer
        int result = 0;

        // Loop through each character of the Roman numeral string
        for (int i = 0; i < s.length(); i++) {

            // Get the integer value of the current Roman character
            int current = value(s.charAt(i));

            // Check if there is a next character after the current character
            if (i + 1 < s.length()) {

                // Get the integer value of the next Roman character
                int next = value(s.charAt(i + 1));

                // If current value is smaller than next value,
                // it means this is a subtraction case.
                // Example: IV = 5 - 1 = 4, IX = 10 - 1 = 9
                if (current < next) {

                    // Subtract the current value from result
                    result -= current;

                } else {

                    // Otherwise, add the current value to result
                    result += current;
                }

            } else {

                // If this is the last character, there is no next character to compare
                // So we simply add its value
                result += current;
            }
        }

        // Return the final integer value
        return result;
    }

    // This helper method converts one Roman character into its integer value
    private int value(char ch) {

        // If character is I, its value is 1
        if (ch == 'I') return 1;

        // If character is V, its value is 5
        if (ch == 'V') return 5;

        // If character is X, its value is 10
        if (ch == 'X') return 10;

        // If character is L, its value is 50
        if (ch == 'L') return 50;

        // If character is C, its value is 100
        if (ch == 'C') return 100;

        // If character is D, its value is 500
        if (ch == 'D') return 500;

        // If character is M, its value is 1000
        if (ch == 'M') return 1000;

        // If character is invalid, return 0
        // In LeetCode, input is usually valid, so this line normally won't be used
        return 0;
    }
}