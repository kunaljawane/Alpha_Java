/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "anagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

*/

//Method 1 

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        ArrayList<Character> s1 = new ArrayList<>();
        ArrayList<Character> t1= new ArrayList<>();

        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
        }

        for(int i=0;i<t.length();i++){
            t1.add(t.charAt(i));
        }
        Collections.sort(s1);
        Collections.sort(t1);

        for(int i=0;i<s1.size();i++){
            if(s1.get(i)!=t1.get(i)){
                return false;
            }
        }
        return true;
    }
}

//Method 2

class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        

        return Arrays.equals(sc,tc);
        
    }
}