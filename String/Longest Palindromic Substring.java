/*


Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 
 
 
 
 We are trying to find the longest palindromic substring in a string.

A palindrome is a string that reads the same forward and backward.

Examples:

"aba" → palindrome
"bb" → palindrome
"abc" → not a palindrome
Main idea

Instead of checking every possible substring directly, we use this trick:

Every palindrome has a center.

That center can be:

one character for odd-length palindromes
Example: "aba" → center is "b"
two characters for even-length palindromes
Example: "abba" → center is between the two "b" characters

So for each position in the string, we try:

expanding from the same index on both sides
expanding from two adjacent indices on both sides

Then we keep the longest palindrome we find.

*/

The code again
class Solution {
    public String longestPalindrome(String s) {
        // Handle empty or single-character strings
        if (s == null || s.length() < 2) return s;

        // This stores the longest palindrome found so far
        String ans = "";

        // Try every character as a center
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome center
            String odd = expand(s, i, i);

            // Even-length palindrome center
            String even = expand(s, i, i + 1);

            // Keep the longer one
            if (odd.length() > ans.length()) ans = odd;
            if (even.length() > ans.length()) ans = even;
        }

        return ans;
    }

    private String expand(String s, int l, int r) {
        // Expand outward while the characters match
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        // When the loop stops, l and r are one step beyond the palindrome
        return s.substring(l + 1, r);
	}
}