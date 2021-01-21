/*

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        List<Character> s1 = new ArrayList<>();
        List<Character> s2 = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            s1.add(s.charAt(i));
            s2.add(t.charAt(i));
        }
        Collections.sort(s1);
        Collections.sort(s2);
        return(s1.equals(s2));
    }
}
