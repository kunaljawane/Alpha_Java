/*


Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

*/


// My own - TIme limit exceeded

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0 ;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            String curr=strs[i];
            List<String> res1 = new ArrayList<>();
            res1.add(curr);
            visited[i]=true;
            
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(curr,strs[j])){
                    res1.add(strs[j]);
                    visited[j]=true;
                   
                }
            }
            res.add(res1);
        }
        return res;
    }

    public boolean isAnagram(String str1 , String str2){

        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1,string2);
    }
}

// solutions

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}