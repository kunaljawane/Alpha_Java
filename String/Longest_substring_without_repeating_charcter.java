/*
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=1;
        if(s.length()<maxLen){
            return 0;
        }

        for(int i=0;i<s.length();i++){
            ArrayList<Character> list = new ArrayList<>();
            list.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                char curr = s.charAt(j);
                if(list.contains(curr)){
                    break;
                }else{
                    list.add(curr);
                }
                maxLen =Math.max(maxLen,list.size());
            }
        }
        return maxLen;
    }
}