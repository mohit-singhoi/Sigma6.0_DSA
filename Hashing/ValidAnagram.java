// Valid Anagram problem
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Input : s= "race", t= "care"
// Output : true

// Input : s= "hello", t= "world"
// Output : false

// Input : s= "listen", t= "silent"
// Output : true

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagarm(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i= 0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);

        }

        for(int i= 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch) -1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }

    // Main Function
    public static void main(String[] args) { // O(n) : N is the length of the string
        String s = "race";
        String t = "care";

        System.out.println("Given String is Anagram or Not : " +isAnagarm(s, t));


    }

}
