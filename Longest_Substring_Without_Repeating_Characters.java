package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 Longest Substring Without Repeating Characters
 Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Longest_Substring_Without_Repeating_Characters {
    static public int lengthOfLongestSubstrings(String s) {
        String ans="";
        ArrayList<String>store=new ArrayList<>();
        String[] arr =s.replace("[//s]","").split("");
        if(s.equals("") )
            return 0;
        for(int i=0;i<arr.length;i++){
            if(!ans.contains(arr[i]))
                ans=ans+arr[i];
            else {
                store.add(ans);
                int index=ans.indexOf(arr[i]);
                ans=ans.substring(index+1,ans.length());
             //   ans="";
                ans=ans+arr[i];

            }
        }
        store.add(ans);
        int val=store.get(0).length();
        for(int i=1;i<store.size();i++){
            if (val<store.get(i).length())
                val=store.get(i).length();

        }
        return val;
    }
    public static void main(String args[]){
        String input="    ";
        System.out.println(lengthOfLongestSubstrings(input) );
    }
}
